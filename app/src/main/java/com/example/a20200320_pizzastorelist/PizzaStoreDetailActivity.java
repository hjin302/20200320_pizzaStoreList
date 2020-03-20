package com.example.a20200320_pizzastorelist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.a20200320_pizzastorelist.databinding.ActivityMainBinding;
import com.example.a20200320_pizzastorelist.databinding.ActivityPizzaStoreDetailBinding;

public class PizzaStoreDetailActivity extends BaseActivity {

    ActivityPizzaStoreDetailBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_pizza_store_detail);
    }

    public PizzaStoreDetailActivity() {
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

    }
}
