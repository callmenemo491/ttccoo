package p371v5;

/* renamed from: v5.d */
/* loaded from: classes.dex */
public final class C6554d {

    /* renamed from: a */
    public static final byte[] f25636a = null;

    /* renamed from: b */
    public static final java.lang.String[] f25637b = null;

    static {
            r0 = 4
            byte[] r0 = new byte[r0]
            r0 = {x0018: FILL_ARRAY_DATA , data: [0, 0, 0, 1} // fill-array
            p371v5.C6554d.f25636a = r0
            java.lang.String r0 = ""
            java.lang.String r1 = "A"
            java.lang.String r2 = "B"
            java.lang.String r3 = "C"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3}
            p371v5.C6554d.f25637b = r0
            return
    }

    /* renamed from: a */
    public static java.lang.String m13338a(int r2, int r3, int r4) {
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1 = 0
            r0[r1] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r3 = 1
            r0[r3] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r3 = 2
            r0[r3] = r2
            java.lang.String r2 = "avc1.%02X%02X%02X"
            java.lang.String r2 = java.lang.String.format(r2, r0)
            return r2
    }

    /* renamed from: b */
    public static java.lang.String m13339b(int r3, boolean r4, int r5, int r6, int[] r7, int r8) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String[] r2 = p371v5.C6554d.f25637b
            r3 = r2[r3]
            r2 = 0
            r1[r2] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r5 = 1
            r1[r5] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r6 = 2
            r1[r6] = r3
            if (r4 == 0) goto L1f
            r3 = 72
            goto L21
        L1f:
            r3 = 76
        L21:
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            r4 = 3
            r1[r4] = r3
            r3 = 4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r1[r3] = r4
            java.lang.String r3 = "hvc1.%s%d.%X.%c%d"
            java.lang.String r3 = p371v5.C6552b0.m13318k(r3, r1)
            r0.<init>(r3)
            int r3 = r7.length
        L39:
            if (r3 <= 0) goto L44
            int r4 = r3 + (-1)
            r4 = r7[r4]
            if (r4 != 0) goto L44
            int r3 = r3 + (-1)
            goto L39
        L44:
            r4 = 0
        L45:
            if (r4 >= r3) goto L5d
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r8 = r7[r4]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r6[r2] = r8
            java.lang.String r8 = ".%02X"
            java.lang.String r6 = java.lang.String.format(r8, r6)
            r0.append(r6)
            int r4 = r4 + 1
            goto L45
        L5d:
            java.lang.String r3 = r0.toString()
            return r3
    }
}
