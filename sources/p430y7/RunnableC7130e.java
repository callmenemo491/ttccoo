package p430y7;

/* renamed from: y7.e */
/* loaded from: classes.dex */
public class RunnableC7130e implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ androidx.appcompat.widget.ActionMenuView f27545Y;

    /* renamed from: Z */
    public final /* synthetic */ int f27546Z;

    /* renamed from: a0 */
    public final /* synthetic */ boolean f27547a0;

    /* renamed from: b0 */
    public final /* synthetic */ com.google.android.material.bottomappbar.BottomAppBar f27548b0;

    public RunnableC7130e(com.google.android.material.bottomappbar.BottomAppBar r1, androidx.appcompat.widget.ActionMenuView r2, int r3, boolean r4) {
            r0 = this;
            r0.f27548b0 = r1
            r0.f27545Y = r2
            r0.f27546Z = r3
            r0.f27547a0 = r4
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r4 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r4.f27545Y
            com.google.android.material.bottomappbar.BottomAppBar r1 = r4.f27548b0
            int r2 = r4.f27546Z
            boolean r3 = r4.f27547a0
            int r1 = r1.m3276z(r0, r2, r3)
            float r1 = (float) r1
            r0.setTranslationX(r1)
            return
    }
}
