package androidx.lifecycle;

/* renamed from: androidx.lifecycle.d0 */
/* loaded from: classes.dex */
public class C0437d0<T> extends androidx.lifecycle.LiveData<T> {
    public C0437d0() {
            r0 = this;
            r0.<init>()
            return
    }

    public C0437d0(T r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // androidx.lifecycle.LiveData
    /* renamed from: j */
    public void mo1415j(T r1) {
            r0 = this;
            super.mo1415j(r1)
            return
    }

    @Override // androidx.lifecycle.LiveData
    /* renamed from: l */
    public void mo7l(T r2) {
            r1 = this;
            java.lang.String r0 = "setValue"
            androidx.lifecycle.LiveData.m1408a(r0)
            int r0 = r1.f2444g
            int r0 = r0 + 1
            r1.f2444g = r0
            r1.f2442e = r2
            r2 = 0
            r1.m1410c(r2)
            return
    }
}
