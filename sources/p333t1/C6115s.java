package p333t1;

/* renamed from: t1.s */
/* loaded from: classes.dex */
public class C6115s extends p333t1.C6114r {

    /* renamed from: f */
    public static boolean f23628f = true;

    /* renamed from: g */
    public static boolean f23629g = true;

    public C6115s() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p333t1.C6119w
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: g */
    public void mo12645g(android.view.View r2, android.graphics.Matrix r3) {
            r1 = this;
            boolean r0 = p333t1.C6115s.f23628f
            if (r0 == 0) goto Lb
            r2.transformMatrixToGlobal(r3)     // Catch: java.lang.NoSuchMethodError -> L8
            goto Lb
        L8:
            r2 = 0
            p333t1.C6115s.f23628f = r2
        Lb:
            return
    }

    @Override // p333t1.C6119w
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: h */
    public void mo12646h(android.view.View r2, android.graphics.Matrix r3) {
            r1 = this;
            boolean r0 = p333t1.C6115s.f23629g
            if (r0 == 0) goto Lb
            r2.transformMatrixToLocal(r3)     // Catch: java.lang.NoSuchMethodError -> L8
            goto Lb
        L8:
            r2 = 0
            p333t1.C6115s.f23629g = r2
        Lb:
            return
    }
}
