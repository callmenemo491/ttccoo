package sb;

/* renamed from: sb.c */
/* loaded from: classes.dex */
public enum EnumC6009c extends java.lang.Enum<sb.EnumC6009c> {

    /* renamed from: Z */
    public static final sb.EnumC6009c f23170Z = null;

    /* renamed from: a0 */
    public static final sb.EnumC6009c f23171a0 = null;

    /* renamed from: b0 */
    public static final sb.EnumC6009c f23172b0 = null;

    /* renamed from: c0 */
    public static final sb.EnumC6009c f23173c0 = null;

    /* renamed from: d0 */
    public static final sb.EnumC6009c f23174d0 = null;

    /* renamed from: e0 */
    public static final sb.EnumC6009c f23175e0 = null;

    /* renamed from: f0 */
    public static final sb.EnumC6009c f23176f0 = null;

    /* renamed from: g0 */
    public static final sb.EnumC6009c f23177g0 = null;

    /* renamed from: h0 */
    public static final sb.EnumC6009c f23178h0 = null;

    /* renamed from: i0 */
    public static final sb.EnumC6009c f23179i0 = null;

    /* renamed from: j0 */
    public static final /* synthetic */ sb.EnumC6009c[] f23180j0 = null;

    /* renamed from: Y */
    public final java.lang.Class<?> f23181Y;

    static {
            java.lang.Class<int[]> r0 = int[].class
            sb.c r1 = new sb.c
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.String r3 = "OTHER"
            r4 = 0
            r1.<init>(r3, r4, r2)
            sb.c r2 = new sb.c
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            java.lang.String r5 = "PURE_BARCODE"
            r6 = 1
            r2.<init>(r5, r6, r3)
            sb.EnumC6009c.f23170Z = r2
            sb.c r3 = new sb.c
            java.lang.Class<java.util.List> r5 = java.util.List.class
            java.lang.String r7 = "POSSIBLE_FORMATS"
            r8 = 2
            r3.<init>(r7, r8, r5)
            sb.EnumC6009c.f23171a0 = r3
            sb.c r5 = new sb.c
            java.lang.Class<java.lang.Void> r7 = java.lang.Void.class
            java.lang.String r9 = "TRY_HARDER"
            r10 = 3
            r5.<init>(r9, r10, r7)
            sb.EnumC6009c.f23172b0 = r5
            sb.c r7 = new sb.c
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            java.lang.String r11 = "CHARACTER_SET"
            r12 = 4
            r7.<init>(r11, r12, r9)
            sb.EnumC6009c.f23173c0 = r7
            sb.c r9 = new sb.c
            java.lang.String r11 = "ALLOWED_LENGTHS"
            r13 = 5
            r9.<init>(r11, r13, r0)
            sb.EnumC6009c.f23174d0 = r9
            sb.c r11 = new sb.c
            java.lang.Class<java.lang.Void> r14 = java.lang.Void.class
            java.lang.String r15 = "ASSUME_CODE_39_CHECK_DIGIT"
            r13 = 6
            r11.<init>(r15, r13, r14)
            sb.EnumC6009c.f23175e0 = r11
            sb.c r14 = new sb.c
            java.lang.Class<java.lang.Void> r15 = java.lang.Void.class
            java.lang.String r13 = "ASSUME_GS1"
            r12 = 7
            r14.<init>(r13, r12, r15)
            sb.EnumC6009c.f23176f0 = r14
            sb.c r13 = new sb.c
            java.lang.Class<java.lang.Void> r15 = java.lang.Void.class
            java.lang.String r12 = "RETURN_CODABAR_START_END"
            r10 = 8
            r13.<init>(r12, r10, r15)
            sb.EnumC6009c.f23177g0 = r13
            sb.c r12 = new sb.c
            java.lang.Class<sb.r> r15 = sb.InterfaceC6024r.class
            java.lang.String r10 = "NEED_RESULT_POINT_CALLBACK"
            r8 = 9
            r12.<init>(r10, r8, r15)
            sb.EnumC6009c.f23178h0 = r12
            sb.c r10 = new sb.c
            java.lang.String r15 = "ALLOWED_EAN_EXTENSIONS"
            r8 = 10
            r10.<init>(r15, r8, r0)
            sb.EnumC6009c.f23179i0 = r10
            r0 = 11
            sb.c[] r0 = new sb.EnumC6009c[r0]
            r0[r4] = r1
            r0[r6] = r2
            r1 = 2
            r0[r1] = r3
            r1 = 3
            r0[r1] = r5
            r1 = 4
            r0[r1] = r7
            r1 = 5
            r0[r1] = r9
            r1 = 6
            r0[r1] = r11
            r1 = 7
            r0[r1] = r14
            r1 = 8
            r0[r1] = r13
            r1 = 9
            r0[r1] = r12
            r0[r8] = r10
            sb.EnumC6009c.f23180j0 = r0
            return
    }

    EnumC6009c(java.lang.String r1, int r2, java.lang.Class r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f23181Y = r3
            return
    }

    public static sb.EnumC6009c valueOf(java.lang.String r1) {
            java.lang.Class<sb.c> r0 = sb.EnumC6009c.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            sb.c r1 = (sb.EnumC6009c) r1
            return r1
    }

    public static sb.EnumC6009c[] values() {
            sb.c[] r0 = sb.EnumC6009c.f23180j0
            java.lang.Object r0 = r0.clone()
            sb.c[] r0 = (sb.EnumC6009c[]) r0
            return r0
    }
}
