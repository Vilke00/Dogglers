/*
* Copyright (C) 2021 The Android Open Source Project.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.example.dogglers.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.R
import com.example.dogglers.data.DataSource
import com.example.dogglers.model.Dog

/**
 * Adapter to inflate the appropriate list item layout and populate the view with information
 * from the appropriate data source
 */
class DogCardAdapter(
    private val context: Context?,
    private val layout: Int
): RecyclerView.Adapter<DogCardAdapter.DogCardViewHolder>() {

    // TODO: Initialize the data using the List found in data/DataSource
    private val dataset: List<Dog> = DataSource.dogs

    /**
     * Initialize view elements
     */
    class DogCardViewHolder(view: View?): RecyclerView.ViewHolder(view!!) {
        val imageView: ImageView? = view?.findViewById(R.id.dogImage)
        val textViewName: TextView? = view?.findViewById(R.id.txtDogName)
        val textViewAge: TextView? = view?.findViewById(R.id.txtDogAge)
        val textViewHobbies: TextView? = view?.findViewById(R.id.txtDogHobbies)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogCardViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)

        val view = when(layout){
            1,2 -> adapterLayout.inflate(R.layout.vertical_horizontal_list_item, parent, false)
            else -> adapterLayout.inflate(R.layout.grid_list_item, parent, false)
        }

        return DogCardViewHolder(view)
    }

    override fun getItemCount(): Int = dataset.size

    override fun onBindViewHolder(holder: DogCardViewHolder, position: Int) {
        val dog = dataset[position]
        val resources = context?.resources

        holder.imageView?.setImageResource(dog.imageResourceId)
        holder.textViewName?.text = dog.name
        holder.textViewAge?.text = resources?.getString(R.string.dog_age, dog.age)
        holder.textViewHobbies?.text = resources?.getString(R.string.dog_hobbies, dog.hobbies)
    }
}
