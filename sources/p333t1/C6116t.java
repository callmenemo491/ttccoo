package p333t1;

/* renamed from: t1.t */
/* loaded from: classes.dex */
public class C6116t extends p333t1.C6115s {

    /* renamed from: h */
    public static boolean f23630h = true;

    public C6116t() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p333t1.C6119w
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: d */
    public void mo12647d(android.view.View r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            boolean r0 = p333t1.C6116t.f23630h
            if (r0 == 0) goto Lb
            r2.setLeftTopRightBottom(r3, r4, r5, r6)     // Catch: java.lang.NoSuchMethodError -> L8
            goto Lb
        L8:
            r2 = 0
            p333t1.C6116t.f23630h = r2
        Lb:
            return
    }
}
