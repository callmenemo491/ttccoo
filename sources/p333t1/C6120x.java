package p333t1;

/* renamed from: t1.x */
/* loaded from: classes.dex */
public class C6120x extends p333t1.C6107k {

    /* renamed from: a */
    public final /* synthetic */ android.view.ViewGroup f23636a;

    /* renamed from: b */
    public final /* synthetic */ android.view.View f23637b;

    /* renamed from: c */
    public final /* synthetic */ android.view.View f23638c;

    /* renamed from: d */
    public final /* synthetic */ p333t1.AbstractC6121y f23639d;

    public C6120x(p333t1.AbstractC6121y r1, android.view.ViewGroup r2, android.view.View r3, android.view.View r4) {
            r0 = this;
            r0.f23639d = r1
            r0.f23636a = r2
            r0.f23637b = r3
            r0.f23638c = r4
            r0.<init>()
            return
    }

    @Override // p333t1.AbstractC6104h.d
    /* renamed from: a */
    public void mo12591a(p333t1.AbstractC6104h r4) {
            r3 = this;
            android.view.View r0 = r3.f23638c
            r1 = 2131362548(0x7f0a02f4, float:1.834488E38)
            r2 = 0
            r0.setTag(r1, r2)
            android.view.ViewGroup r0 = r3.f23636a
            android.view.ViewGroupOverlay r0 = r0.getOverlay()
            android.view.View r1 = r3.f23637b
            r0.remove(r1)
            r4.mo12630z(r3)
            return
    }

    @Override // p333t1.C6107k, p333t1.AbstractC6104h.d
    /* renamed from: d */
    public void mo12593d(p333t1.AbstractC6104h r2) {
            r1 = this;
            android.view.ViewGroup r2 = r1.f23636a
            android.view.ViewGroupOverlay r2 = r2.getOverlay()
            android.view.View r0 = r1.f23637b
            r2.remove(r0)
            return
    }

    @Override // p333t1.C6107k, p333t1.AbstractC6104h.d
    /* renamed from: e */
    public void mo12594e(p333t1.AbstractC6104h r2) {
            r1 = this;
            android.view.View r2 = r1.f23637b
            android.view.ViewParent r2 = r2.getParent()
            if (r2 != 0) goto L14
            android.view.ViewGroup r2 = r1.f23636a
            android.view.ViewGroupOverlay r2 = r2.getOverlay()
            android.view.View r0 = r1.f23637b
            r2.add(r0)
            goto L19
        L14:
            t1.y r2 = r1.f23639d
            r2.cancel()
        L19:
            return
    }
}
