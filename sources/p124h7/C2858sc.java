package p124h7;

/* renamed from: h7.sc */
/* loaded from: classes.dex */
public final class C2858sc extends p124h7.AbstractC2947xb implements java.io.Serializable {

    /* renamed from: Z */
    public final java.util.regex.Pattern f11910Z;

    public C2858sc(java.util.regex.Pattern r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            java.util.Objects.requireNonNull(r2)
            r1.f11910Z = r2
            return
    }

    @Override // p124h7.AbstractC2947xb
    /* renamed from: d */
    public final p124h7.C2570cc mo7137d(java.lang.CharSequence r3) {
            r2 = this;
            h7.cc r0 = new h7.cc
            java.util.regex.Pattern r1 = r2.f11910Z
            java.util.regex.Matcher r3 = r1.matcher(r3)
            r0.<init>(r3)
            return r0
    }

    @Override // p124h7.AbstractC2947xb
    public final java.lang.String toString() {
            r1 = this;
            java.util.regex.Pattern r0 = r1.f11910Z
            java.lang.String r0 = r0.toString()
            return r0
    }
}
