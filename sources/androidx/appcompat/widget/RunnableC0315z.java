package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.z */
/* loaded from: classes.dex */
public class RunnableC0315z implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ android.widget.TextView f1503Y;

    /* renamed from: Z */
    public final /* synthetic */ android.graphics.Typeface f1504Z;

    /* renamed from: a0 */
    public final /* synthetic */ int f1505a0;

    public RunnableC0315z(androidx.appcompat.widget.C0313y r1, android.widget.TextView r2, android.graphics.Typeface r3, int r4) {
            r0 = this;
            r0.f1503Y = r2
            r0.f1504Z = r3
            r0.f1505a0 = r4
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r3 = this;
            android.widget.TextView r0 = r3.f1503Y
            android.graphics.Typeface r1 = r3.f1504Z
            int r2 = r3.f1505a0
            r0.setTypeface(r1, r2)
            return
    }
}
