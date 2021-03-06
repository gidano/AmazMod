package com.huami.watch.companion.update;

import android.widget.Toast;

import com.edotasx.amazfit.R;
import com.huami.watch.companion.CompanionApplication;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import lanchon.dexpatcher.annotation.DexAdd;

/**
 * Created by edoardotassinari on 13/03/18.
 */

@DexAdd
public class ToastUpgradeObserver implements Observer<Boolean> {
    @Override
    public void onComplete() {
    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onNext(Boolean aBoolean) {
        if (aBoolean.booleanValue() && CompanionApplication.getContext() != null) {
            Toast.makeText(CompanionApplication.getContext(), R.string.rom_update_available_enable_ota_in_mod_settins, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onSubscribe(Disposable disposable) {

    }
}
