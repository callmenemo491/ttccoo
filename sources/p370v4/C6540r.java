package p370v4;

/* renamed from: v4.r */
/* loaded from: classes.dex */
public final class C6540r {

    /* renamed from: a */
    public final int f25566a;

    /* renamed from: b */
    public boolean f25567b;

    /* renamed from: c */
    public boolean f25568c;

    /* renamed from: d */
    public byte[] f25569d;

    /* renamed from: e */
    public int f25570e;

    public C6540r(int r2, int r3) {
            r1 = this;
            r1.<init>()
            r1.f25566a = r2
            int r3 = r3 + 3
            byte[] r2 = new byte[r3]
            r1.f25569d = r2
            r3 = 2
            r0 = 1
            r2[r3] = r0
            return
    }

    /* renamed from: a */
    public void m13276a(byte[] r5, int r6, int r7) {
            r4 = this;
            boolean r0 = r4.f25567b
            if (r0 != 0) goto L5
            return
        L5:
            int r7 = r7 - r6
            byte[] r0 = r4.f25569d
            int r1 = r0.length
            int r2 = r4.f25570e
            int r3 = r2 + r7
            if (r1 >= r3) goto L18
            int r2 = r2 + r7
            int r2 = r2 * 2
            byte[] r0 = java.util.Arrays.copyOf(r0, r2)
            r4.f25569d = r0
        L18:
            byte[] r0 = r4.f25569d
            int r1 = r4.f25570e
            java.lang.System.arraycopy(r5, r6, r0, r1, r7)
            int r5 = r4.f25570e
            int r5 = r5 + r7
            r4.f25570e = r5
            return
    }

    /* renamed from: b */
    public boolean m13277b(int r3) {
            r2 = this;
            boolean r0 = r2.f25567b
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r2.f25570e
            int r0 = r0 - r3
            r2.f25570e = r0
            r2.f25567b = r1
            r3 = 1
            r2.f25568c = r3
            return r3
    }

    /* renamed from: c */
    public void m13278c() {
            r1 = this;
            r0 = 0
            r1.f25567b = r0
            r1.f25568c = r0
            return
    }

    /* renamed from: d */
    public void m13279d(int r4) {
            r3 = this;
            boolean r0 = r3.f25567b
            r1 = 1
            r0 = r0 ^ r1
            p371v5.C6549a.m13291e(r0)
            int r0 = r3.f25566a
            r2 = 0
            if (r4 != r0) goto Ld
            goto Le
        Ld:
            r1 = 0
        Le:
            r3.f25567b = r1
            if (r1 == 0) goto L17
            r4 = 3
            r3.f25570e = r4
            r3.f25568c = r2
        L17:
            return
    }
}
