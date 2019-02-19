package wxc.android.componentization.router;

import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * 如果不想让业务开放接口下沉到一个统一的Module中，则可将Module拆分成export module和implementation module
 */
public interface IFeature1Service extends IProvider {

    void sayHello(String name);
}
