package p333t1;

/* renamed from: t1.u */
/* loaded from: classes.dex */
public class C6117u extends p333t1.C6116t {

    /* renamed from: i */
    public static boolean f23631i = true;

    public C6117u() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p333t1.C6119w
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: f */
    public void mo12648f(android.view.View r3, int r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 != r1) goto La
            super.mo12648f(r3, r4)
            goto L15
        La:
            boolean r0 = p333t1.C6117u.f23631i
            if (r0 == 0) goto L15
            r3.setTransitionVisibility(r4)     // Catch: java.lang.NoSuchMethodError -> L12
            goto L15
        L12:
            r3 = 0
            p333t1.C6117u.f23631i = r3
        L15:
            return
    }
}
