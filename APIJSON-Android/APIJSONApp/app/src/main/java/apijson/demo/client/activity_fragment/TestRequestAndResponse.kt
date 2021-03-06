package apijson.demo.client.activity_fragment

import com.alibaba.fastjson.JSONArray
import com.alibaba.fastjson.JSONObject
import zuo.biao.apijson.JSON
import java.util.*

fun request(): Map<String, Any> {
    return mapOf(
            "emptyList" to ArrayList<Any>(),
            "[]" to mapOf(
                    "count" to 5,
                    "page" to 0,
                    "join" to "&/User:owner/id@",
                    "Moment" to HashMap<String, Any>(),
                    "User:owner" to mapOf(
                            "id{}" to listOf(82001, 82002),
                            "id@" to "/Moment/userId",
                            "@column" to "id,name,head"
                    ),
                    "User:praiseUser[]" to mapOf(
                            "count" to 10,
                            "User" to mapOf(
                                    "id{}@" to "[]/Moment/praiseUserIdList",
                                    "@column" to "id,name"
                            )
                    ),
                    "CommentItem[]" to mapOf(
                            "count" to 6,
                            "join" to "</User:publisher/id@",
                            "Comment" to mapOf(
                                    "@order" to "date+",
                                    "momentId@" to "[]/Moment/id"
                            ),
                            "User:publisher" to mapOf(
                                    "id@" to "/Comment/userId",
                                    "@column" to "id,name"
                            )
                    )
            )
    )
}

fun response(resultJson: String?) {

    var response: JSONObject = JSON.parseObject(resultJson)


//[]<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    var list: JSONArray? = response.getJSONArray("[]")
    if (list == null) {
        list = JSONArray()
    }

    var item: JSONObject?
    for (i in 0..list.size - 1) {
        item = list.getJSONObject(i)
        if (item == null) {
            continue
        }
        println("\nitem = list[" + i + "] = \n" + item + "\n\n")
        //TODO 你的代码


        //Moment<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        var moment: JSONObject? = item.getJSONObject("Moment")
        if (moment == null) {
            moment = JSONObject()
        }

        var id = moment.getLongValue("id")
        println("moment.id = " + id);
        var userId = moment.getLongValue("userId")
        println("moment.userId = " + userId);
        var date = moment.getString("date")
        println("moment.date = " + date);
        var content = moment.getString("content")
        println("moment.content = " + content);

        //praiseUserIdList<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        var praiseUserIdList1: JSONArray? = moment.getJSONArray("praiseUserIdList")
        if (praiseUserIdList1 == null) {
            praiseUserIdList1 = JSONArray()
        }

        var item1: Int?
        for (i1 in 0..praiseUserIdList1.size - 1) {
            item1 = praiseUserIdList1.getInteger(i1)
            if (item1 == null) {
                continue
            }
            println("\nitem1 = praiseUserIdList1[" + i1 + "] = \n" + item1 + "\n\n")
            //TODO 你的代码

        }//praiseUserIdList>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


        //pictureList<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        var pictureList1: JSONArray? = moment.getJSONArray("pictureList")
        if (pictureList1 == null) {
            pictureList1 = JSONArray()
        }

        var item2: String?
        for (i1 in 0..pictureList1.size - 1) {
            item2 = pictureList1.getString(i1)
            if (item2 == null) {
                continue
            }
            println("\nitem1 = pictureList1[" + i1 + "] = \n" + item2 + "\n\n")
            //TODO 你的代码

        }//pictureList>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        //Moment>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


        //User:owner<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        var owner: JSONObject? = item.getJSONObject("User:owner")
        if (owner == null) {
            owner = JSONObject()
        }

        var id2 = owner.getLongValue("id")
        println("owner.id = " + id);
        var name = owner.getString("name")
        println("owner.name = " + name);
        var head = owner.getString("head")
        println("owner.head = " + head);
        //User:owner>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


        //User:praiseUser[]<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        var praiseUserList1: JSONArray? = item.getJSONArray("User:praiseUser[]")
        if (praiseUserList1 == null) {
            praiseUserList1 = JSONArray()
        }

        var item3: JSONObject?
        for (i1 in 0..praiseUserList1.size - 1) {
            item3 = praiseUserList1.getJSONObject(i1)
            if (item3 == null) {
                continue
            }
            println("\nitem3 = praiseUserList1[" + i1 + "] = \n" + item3 + "\n\n")
            //TODO 你的代码

            var id = item3.getLongValue("id")
            println("item3.id = " + id);
            var name = item3.getString("name")
            println("item3.name = " + name);
        }//User:praiseUser[]>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


        //CommentItem[]<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        var commentItemList1: JSONArray? = item.getJSONArray("CommentItem[]")
        if (commentItemList1 == null) {
            commentItemList1 = JSONArray()
        }

        var item4: JSONObject?
        for (i1 in 0..commentItemList1.size - 1) {
            item4 = commentItemList1.getJSONObject(i1)
            if (item4 == null) {
                continue
            }
            println("\nitem4 = commentItemList1[" + i1 + "] = \n" + item4 + "\n\n")
            //TODO 你的代码


            //Comment<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
            var comment: JSONObject? = item4.getJSONObject("Comment")
            if (comment == null) {
                comment = JSONObject()
            }

            var id3 = comment.getLongValue("id")
            println("comment.id3 = " + id3);
            var toId = comment.getLongValue("toId")
            println("comment.toId = " + toId);
            var userId = comment.getLongValue("userId")
            println("comment.userId = " + userId);
            var momentId = comment.getLongValue("momentId")
            println("comment.momentId = " + momentId);
            var date = comment.getString("date")
            println("comment.date = " + date);
            var content = comment.getString("content")
            println("comment.content = " + content);
            //Comment>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


            //User:publisher<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
            var publisher: JSONObject? = item4.getJSONObject("User:publisher")
            if (publisher == null) {
                publisher = JSONObject()
            }

            var id4 = publisher.getLongValue("id")
            println("publisher.id4 = " + id4);
            var name = publisher.getString("name")
            println("publisher.name = " + name);
            //User:publisher>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        }//CommentItem[]>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    }//[]>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


//emptyList<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    var emptyList: JSONArray? = response.getJSONArray("emptyList")
    if (emptyList == null) {
        emptyList = JSONArray()
    }

    var item5: Any?
    for (i in 0..emptyList.size - 1) {
        item5 = emptyList.get(i)
        if (item5 == null) {
            continue
        }
        println("\nitem5 = emptyList[" + i + "] = \n" + item5 + "\n\n")
        //TODO 你的代码

    }//emptyList>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    var code = response.getIntValue("code")
    println("response.code = " + code);
    var msg = response.getString("msg")
    println("response.msg = " + msg);

}