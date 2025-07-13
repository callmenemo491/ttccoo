package td;

import p383w1.InterfaceC6776a;

/* renamed from: td.b */
/* loaded from: classes.dex */
public abstract class AbstractActivityC6214b<T extends p383w1.InterfaceC6776a> extends p083f.ActivityC1921h {

    /* renamed from: l0 */
    public T f24169l0;

    public AbstractActivityC6214b() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.fragment.app.ActivityC0405s, androidx.activity.ComponentActivity, p030c0.ActivityC0820g, android.app.Activity
    public void onCreate(android.os.Bundle r1) {
            r0 = this;
            super.onCreate(r1)
            w1.a r1 = r0.mo7726z()
            r0.f24169l0 = r1
            p214m2.C4339q.m9704i(r1)
            android.view.View r1 = r1.mo1053b()
            r0.setContentView(r1)
            return
    }

    /* renamed from: z */
    public abstract T mo7726z();
}
