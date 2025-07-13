package p158j0;

/* renamed from: j0.g */
/* loaded from: classes.dex */
public final class C3385g implements p158j0.InterfaceC3384f {

    /* renamed from: a */
    public final android.os.LocaleList f14542a;

    public C3385g(android.os.LocaleList r1) {
            r0 = this;
            r0.<init>()
            r0.f14542a = r1
            return
    }

    @Override // p158j0.InterfaceC3384f
    /* renamed from: a */
    public java.lang.Object mo7758a() {
            r1 = this;
            android.os.LocaleList r0 = r1.f14542a
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            android.os.LocaleList r0 = r1.f14542a
            j0.f r2 = (p158j0.InterfaceC3384f) r2
            java.lang.Object r2 = r2.mo7758a()
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // p158j0.InterfaceC3384f
    public java.util.Locale get(int r2) {
            r1 = this;
            android.os.LocaleList r0 = r1.f14542a
            java.util.Locale r2 = r0.get(r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            android.os.LocaleList r0 = r1.f14542a
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            android.os.LocaleList r0 = r1.f14542a
            java.lang.String r0 = r0.toString()
            return r0
    }
}
