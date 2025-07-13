package p333t1;

/* renamed from: t1.f */
/* loaded from: classes.dex */
public abstract class AbstractC6102f implements sb.InterfaceC6025s {
    public AbstractC6102f(int r1) {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static int m12600a(boolean[] r7, int r8, int[] r9, boolean r10) {
            int r0 = r9.length
            r1 = 0
            r2 = 0
            r3 = 0
        L4:
            if (r2 >= r0) goto L19
            r4 = r9[r2]
            r5 = 0
        L9:
            if (r5 >= r4) goto L13
            int r6 = r8 + 1
            r7[r8] = r10
            int r5 = r5 + 1
            r8 = r6
            goto L9
        L13:
            int r3 = r3 + r4
            r10 = r10 ^ 1
            int r2 = r2 + 1
            goto L4
        L19:
            return r3
    }

    /* renamed from: b */
    public abstract boolean[] mo7404b(java.lang.String r1);

    /* renamed from: c */
    public int mo7432c() {
            r1 = this;
            r0 = 10
            return r0
    }

    @Override // sb.InterfaceC6025s
    /* renamed from: d */
    public p453zb.C7270b mo7086d(java.lang.String r5, sb.EnumC6007a r6, int r7, int r8, java.util.Map<sb.EnumC6011e, ?> r9) {
            r4 = this;
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L6c
            if (r7 < 0) goto L50
            if (r8 < 0) goto L50
            int r6 = r4.mo7432c()
            if (r9 == 0) goto L24
            sb.e r0 = sb.EnumC6011e.f23187d0
            boolean r1 = r9.containsKey(r0)
            if (r1 == 0) goto L24
            java.lang.Object r6 = r9.get(r0)
            java.lang.String r6 = r6.toString()
            int r6 = java.lang.Integer.parseInt(r6)
        L24:
            boolean[] r5 = r4.mo7404b(r5)
            int r9 = r5.length
            int r6 = r6 + r9
            int r7 = java.lang.Math.max(r7, r6)
            r0 = 1
            int r8 = java.lang.Math.max(r0, r8)
            int r6 = r7 / r6
            int r0 = r9 * r6
            int r0 = r7 - r0
            int r0 = r0 / 2
            zb.b r1 = new zb.b
            r1.<init>(r7, r8)
            r7 = 0
            r2 = 0
        L42:
            if (r2 >= r9) goto L4f
            boolean r3 = r5[r2]
            if (r3 == 0) goto L4b
            r1.m14377g(r0, r7, r6, r8)
        L4b:
            int r2 = r2 + 1
            int r0 = r0 + r6
            goto L42
        L4f:
            return r1
        L50:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r9 = "Negative size is not allowed. Input: "
            r6.<init>(r9)
            r6.append(r7)
            r7 = 120(0x78, float:1.68E-43)
            r6.append(r7)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L6c:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Found empty contents"
            r5.<init>(r6)
            throw r5
    }

    /* renamed from: e */
    public abstract android.graphics.Path mo12601e(float r1, float r2, float r3, float r4);

    /* renamed from: f */
    public abstract void mo7571f(java.lang.Throwable r1, java.lang.Throwable r2);
}
