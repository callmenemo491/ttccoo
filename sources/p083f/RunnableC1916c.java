package p083f;

/* renamed from: f.c */
/* loaded from: classes.dex */
public class RunnableC1916c implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ android.view.View f8311Y;

    /* renamed from: Z */
    public final /* synthetic */ android.view.View f8312Z;

    /* renamed from: a0 */
    public final /* synthetic */ androidx.appcompat.app.AlertController f8313a0;

    public RunnableC1916c(androidx.appcompat.app.AlertController r1, android.view.View r2, android.view.View r3) {
            r0 = this;
            r0.f8313a0 = r1
            r0.f8311Y = r2
            r0.f8312Z = r3
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r3 = this;
            androidx.appcompat.app.AlertController r0 = r3.f8313a0
            androidx.core.widget.NestedScrollView r0 = r0.f648A
            android.view.View r1 = r3.f8311Y
            android.view.View r2 = r3.f8312Z
            androidx.appcompat.app.AlertController.m451c(r0, r1, r2)
            return
    }
}
