package p333t1;

/* renamed from: t1.r */
/* loaded from: classes.dex */
public class C6114r extends p333t1.C6119w {

    /* renamed from: e */
    public static boolean f23627e = true;

    public C6114r() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p333t1.C6119w
    /* renamed from: a */
    public void mo12641a(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // p333t1.C6119w
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: b */
    public float mo12642b(android.view.View r2) {
            r1 = this;
            boolean r0 = p333t1.C6114r.f23627e
            if (r0 == 0) goto Lc
            float r2 = r2.getTransitionAlpha()     // Catch: java.lang.NoSuchMethodError -> L9
            return r2
        L9:
            r0 = 0
            p333t1.C6114r.f23627e = r0
        Lc:
            float r2 = r2.getAlpha()
            return r2
    }

    @Override // p333t1.C6119w
    /* renamed from: c */
    public void mo12643c(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // p333t1.C6119w
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: e */
    public void mo12644e(android.view.View r2, float r3) {
            r1 = this;
            boolean r0 = p333t1.C6114r.f23627e
            if (r0 == 0) goto Lb
            r2.setTransitionAlpha(r3)     // Catch: java.lang.NoSuchMethodError -> L8
            return
        L8:
            r0 = 0
            p333t1.C6114r.f23627e = r0
        Lb:
            r2.setAlpha(r3)
            return
    }
}
