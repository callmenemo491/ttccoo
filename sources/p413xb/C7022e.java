package p413xb;

/* renamed from: xb.e */
/* loaded from: classes.dex */
public final class C7022e {

    /* renamed from: a */
    public static final java.util.regex.Pattern f27345a = null;

    /* renamed from: b */
    public static final java.util.Map<java.lang.String, java.util.Set<sb.EnumC6007a>> f27346b = null;

    static {
            java.lang.String r0 = ","
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            p413xb.C7022e.f27345a = r0
            sb.a r0 = sb.EnumC6007a.f23162j0
            java.util.EnumSet r0 = java.util.EnumSet.of(r0)
            sb.a r1 = sb.EnumC6007a.f23156d0
            java.util.EnumSet r1 = java.util.EnumSet.of(r1)
            sb.a r2 = sb.EnumC6007a.f23151Y
            java.util.EnumSet r2 = java.util.EnumSet.of(r2)
            sb.a r3 = sb.EnumC6007a.f23161i0
            java.util.EnumSet r3 = java.util.EnumSet.of(r3)
            sb.a r4 = sb.EnumC6007a.f23165m0
            r5 = 5
            sb.a[] r5 = new sb.EnumC6007a[r5]
            sb.a r6 = sb.EnumC6007a.f23166n0
            r7 = 0
            r5[r7] = r6
            sb.a r6 = sb.EnumC6007a.f23158f0
            r7 = 1
            r5[r7] = r6
            sb.a r6 = sb.EnumC6007a.f23157e0
            r7 = 2
            r5[r7] = r6
            sb.a r6 = sb.EnumC6007a.f23163k0
            r7 = 3
            r5[r7] = r6
            sb.a r6 = sb.EnumC6007a.f23164l0
            r7 = 4
            r5[r7] = r6
            java.util.EnumSet r4 = java.util.EnumSet.of(r4, r5)
            sb.a r5 = sb.EnumC6007a.f23153a0
            sb.a r6 = sb.EnumC6007a.f23154b0
            sb.a r7 = sb.EnumC6007a.f23155c0
            sb.a r8 = sb.EnumC6007a.f23159g0
            sb.a r9 = sb.EnumC6007a.f23152Z
            java.util.EnumSet r5 = java.util.EnumSet.of(r5, r6, r7, r8, r9)
            java.util.EnumSet r6 = java.util.EnumSet.copyOf(r4)
            r6.addAll(r5)
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            p413xb.C7022e.f27346b = r5
            java.lang.String r7 = "ONE_D_MODE"
            r5.put(r7, r6)
            java.lang.String r6 = "PRODUCT_MODE"
            r5.put(r6, r4)
            java.lang.String r4 = "QR_CODE_MODE"
            r5.put(r4, r0)
            java.lang.String r0 = "DATA_MATRIX_MODE"
            r5.put(r0, r1)
            java.lang.String r0 = "AZTEC_MODE"
            r5.put(r0, r2)
            java.lang.String r0 = "PDF417_MODE"
            r5.put(r0, r3)
            return
    }
}
