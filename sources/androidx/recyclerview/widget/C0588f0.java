package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.f0 */
/* loaded from: classes.dex */
public class C0588f0 implements androidx.recyclerview.widget.C0591h.b {

    /* renamed from: a */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f3408a;

    public C0588f0(androidx.recyclerview.widget.RecyclerView r1) {
            r0 = this;
            r0.f3408a = r1
            r0.<init>()
            return
    }

    /* renamed from: a */
    public android.view.View m2033a(int r2) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.f3408a
            android.view.View r2 = r0.getChildAt(r2)
            return r2
    }

    /* renamed from: b */
    public int m2034b() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.f3408a
            int r0 = r0.getChildCount()
            return r0
    }

    /* renamed from: c */
    public void m2035c(int r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r2.f3408a
            android.view.View r0 = r0.getChildAt(r3)
            if (r0 == 0) goto L10
            androidx.recyclerview.widget.RecyclerView r1 = r2.f3408a
            r1.m1770p(r0)
            r0.clearAnimation()
        L10:
            androidx.recyclerview.widget.RecyclerView r0 = r2.f3408a
            r0.removeViewAt(r3)
            return
    }
}
