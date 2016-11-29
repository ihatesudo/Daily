package com.meiji.daily.mvp.useradd;

import com.meiji.daily.bean.ZhuanlanBean;

import java.util.List;

/**
 * Created by Meiji on 2016/11/27.
 */

public interface IUseradd {

    interface View {

        void onCheckInputId();

        void onSetAdapter(List<ZhuanlanBean> list);

        void onShowRefreshing();

        void onHideRefreshing();

        void onAddFail();

        void onAddSuccess();

        void onRemoveItem(int adapterPosition, String slug);

    }

    interface Presenter {


        boolean doQueryDB();

        void doCheckInputId(String input);

        /**
         * 保存到数据库
         */
        void doSaveInputId();

        void doSetAdapter();

        void onFail();

        void doOnClickItem(int position);

        void doRefresh();

        void doRemoveItem(int position);
    }

    interface Model {

        boolean getRequestData(String url);

        /**
         * 返回数据
         */
        List<ZhuanlanBean> getList();

        /**
         * 结束
         */
        void onDestroy();
    }


}
