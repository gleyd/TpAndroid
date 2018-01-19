package com.dmr.tpfragmentcommunication.tproom;

import android.arch.persistence.room.Room;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.dmr.tpfragmentcommunication.tproom.db.AppDatabase;
import com.dmr.tpfragmentcommunication.tproom.entity.User;
import com.dmr.tpfragmentcommunication.tproom.entity.UserDao;

public class MainActivity extends AppCompatActivity {

    private UserDao dao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class,"users.db").build();
        dao = db.userDao();
    }

    public void clickUserAdd(View v){
        User u =new User();
        u.setFirstName("Robert");
        u.setLastName("MARTIN");
        UserDBTask userDBTask = new UserDBTask();
        userDBTask.execute(u);
    }
    class UserDBTask extends AsyncTask<User, Integer,Integer>{


        @Override
        protected Integer doInBackground(User... users) {

            dao.insertAll(users);
            return 1;
        }
    }
}
