package wxc.android.componentization.router;

import com.alibaba.android.arouter.facade.template.IProvider;

public interface IAppService extends IProvider {

    void sayBye(String name);
}
