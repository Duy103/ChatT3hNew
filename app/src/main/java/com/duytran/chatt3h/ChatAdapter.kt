package com.duytran.chatt3h

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.duytran.chatt3h.databinding.ItemChatBinding
import com.duytran.chatt3h.databinding.ItemChatRecievedBinding

class ChatAdapter(
    private val chats: List<Chat>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun getItemViewType(position: Int): Int {
        return if(position % 2 ==0){
            0
        }else{
            1
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return if(viewType == 0)
        {
            val binding: ItemChatBinding =
                ItemChatBinding.inflate(layoutInflater, parent, false)
            ChatViewHolder(binding)
        }else {
            val receivedBinding: ItemChatRecievedBinding =
                ItemChatRecievedBinding.inflate(layoutInflater, parent, false)
            ChatReceivedViewHolder(receivedBinding)
        }
    }

    override fun getItemCount(): Int = chats.size
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val chat = chats[position]
        if (holder is ChatViewHolder) {
            holder.binding.textMessage.text = chat.title
            holder.binding.textDateTime.text = chat.timeDes
        }else if(holder is ChatReceivedViewHolder){
            holder.binding.textMessageRecieve.text = chat.title
            holder.binding.textDateTimeRecieve.text = chat.timeDes
        }
    }

    inner class ChatViewHolder(val binding: ItemChatBinding): RecyclerView.ViewHolder(binding.root)
    inner class ChatReceivedViewHolder(val binding: ItemChatRecievedBinding): RecyclerView.ViewHolder(binding.root)
}

