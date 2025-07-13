package cd;

/* renamed from: cd.b */
/* loaded from: classes.dex */
public final class C0947b {

    /* renamed from: a */
    public byte[] f4936a;

    /* renamed from: b */
    public int f4937b;

    public C0947b(int r1, byte[] r2, int r3, int r4) {
            r0 = this;
            r2 = r4 & 2
            if (r2 == 0) goto L7
            byte[] r1 = new byte[r1]
            goto L8
        L7:
            r1 = 0
        L8:
            r2 = r4 & 4
            if (r2 == 0) goto Ld
            r3 = 0
        Ld:
            java.lang.String r2 = "buffer"
            p214m2.C4339q.m9707l(r1, r2)
            r0.<init>()
            r0.f4936a = r1
            r0.f4937b = r3
            return
    }

    /* renamed from: b */
    public static cd.C0947b m2670b(cd.C0947b r2, byte[] r3, int r4, int r5, int r6) {
            r0 = r6 & 2
            if (r0 == 0) goto L5
            r4 = 0
        L5:
            r6 = r6 & 4
            if (r6 == 0) goto La
            int r5 = r3.length
        La:
            java.util.Objects.requireNonNull(r2)
            if (r4 < 0) goto L33
            int r6 = r3.length
            if (r4 > r6) goto L33
            if (r5 < 0) goto L33
            int r6 = r4 + r5
            if (r6 < 0) goto L33
            int r0 = r3.length
            if (r6 > r0) goto L33
            if (r5 != 0) goto L1e
            goto L32
        L1e:
            int r6 = r2.f4937b
            int r6 = r6 + r5
            byte[] r0 = r2.f4936a
            int r0 = r0.length
            if (r6 <= r0) goto L29
            r2.m2672c(r6)
        L29:
            byte[] r0 = r2.f4936a
            int r1 = r2.f4937b
            java.lang.System.arraycopy(r3, r4, r0, r1, r5)
            r2.f4937b = r6
        L32:
            return r2
        L33:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r6 = "off: "
            java.lang.String r0 = " len: "
            java.lang.String r1 = " b.length: "
            java.lang.StringBuilder r4 = androidx.recyclerview.widget.C0608s.m2117a(r6, r4, r0, r5, r1)
            int r3 = r3.length
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
    }

    /* renamed from: a */
    public final cd.C0947b m2671a(byte r4) {
            r3 = this;
            int r0 = r3.f4937b
            int r0 = r0 + 1
            byte[] r1 = r3.f4936a
            int r1 = r1.length
            if (r0 <= r1) goto Lc
            r3.m2672c(r0)
        Lc:
            byte[] r1 = r3.f4936a
            int r2 = r3.f4937b
            byte r4 = (byte) r4
            r1[r2] = r4
            r3.f4937b = r0
            return r3
    }

    /* renamed from: c */
    public final void m2672c(int r4) {
            r3 = this;
            byte[] r0 = r3.f4936a
            int r0 = r0.length
            int r0 = r0 << 1
            int r4 = java.lang.Math.max(r0, r4)
            byte[] r4 = new byte[r4]
            byte[] r0 = r3.f4936a
            int r1 = r3.f4937b
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r4, r2, r1)
            r3.f4936a = r4
            return
    }
}
