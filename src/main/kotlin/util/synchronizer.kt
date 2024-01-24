package util

fun <T> sync(
    localData: List<T>,
    remoteData: List<T>,
    updateLocal: (T) -> Unit,
    updateRemote: (T) -> Unit,
    deleteRemote: (T) -> Unit
) {
    // Find data to add, update, and delete
    val dataToAdd = remoteData - localData
    val dataToUpdate = localData.intersect(remoteData).distinct()
    val dataToDelete = localData - remoteData

    // Update local data
    dataToAdd.forEach { updateLocal(it) }
    dataToUpdate.forEach { updateLocal(it) }
    dataToDelete.forEach { deleteRemote(it) }

    // Update remote data
    localData.forEach { updateRemote(it) }
}

data class YourDataModel(
    val id: String,
    val name: String,
)

fun main() {
    // Define your local and remote data
    // Mock local and remote data
    val mutableLocalData = mutableListOf(
        YourDataModel("1", "LocalItem1"),
        YourDataModel("2", "LocalItem2"),
        YourDataModel("4","LocalItem4")
    )

    val mutableRemoteData = mutableListOf(
        YourDataModel("1", "RemoteItem1"),
        YourDataModel("2", "LocalItem2"),
        YourDataModel("3", "RemoteItem3")
    )

    val localData: List<YourDataModel> = mutableLocalData
    val remoteData: List<YourDataModel> = mutableRemoteData

    sync(
        localData,
        remoteData,
        updateLocal = { model ->
            println("local update: $model")
            mutableLocalData.add(model)
        },
        updateRemote = { data ->
            println("remote update: $data")
            mutableRemoteData.add(data)
        },
        deleteRemote = { data ->
            println("delete remote: $data")
            mutableRemoteData.remove(data)

        }
    )
    println("local data: ${localData.toSet()}")
    println("remote data: ${remoteData.toSet()}")
}