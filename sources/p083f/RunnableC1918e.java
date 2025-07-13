package p083f;

/* renamed from: f.e */
/* loaded from: classes.dex */
public class RunnableC1918e implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ android.view.View f8316Y;

    /* renamed from: Z */
    public final /* synthetic */ android.view.View f8317Z;

    /* renamed from: a0 */
    public final /* synthetic */ androidx.appcompat.app.AlertController f8318a0;

    public RunnableC1918e(androidx.appcompat.app.AlertController r1, android.view.View r2, android.view.View r3) {
            r0 = this;
            r0.f8318a0 = r1
            r0.f8316Y = r2
            r0.f8317Z = r3
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r3 = this;
            androidx.appcompat.app.AlertController r0 = r3.f8318a0
            android.widget.ListView r0 = r0.f672g
            android.view.View r1 = r3.f8316Y
            android.view.View r2 = r3.f8317Z
            androidx.appcompat.app.AlertController.m451c(r0, r1, r2)
            return
    }
}
