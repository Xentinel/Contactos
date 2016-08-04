package com.think.contactos;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.think.contactos.adaptador.contactoAdaptador;
import com.think.contactos.adaptador.pageAdapter;
import com.think.contactos.fragments.fragmentListaContactos;
import com.think.contactos.fragments.perfil;
import com.think.contactos.pojo.Contacto;

import java.util.ArrayList;

public class Contactos extends AppCompatActivity {
    private Toolbar toolbar;
    private ViewPager viewPager;
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactos);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        if (toolbar!=null){
            setSupportActionBar(toolbar);
        }
        setupViewPager();

    }
    private ArrayList<Fragment> agregarFragments() {
        ArrayList<Fragment> arregloFragments = new ArrayList<Fragment>();
        arregloFragments.add(new fragmentListaContactos());
        arregloFragments.add(new perfil());
        return  arregloFragments;
    }

    private  void setupViewPager (){
        viewPager.setAdapter(new pageAdapter(getSupportFragmentManager(),agregarFragments()));
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_contacts);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_detail);
    }

}
