package p406x4;

/* renamed from: x4.j */
/* loaded from: classes.dex */
public final class C6936j {

    /* renamed from: a */
    public int f27009a;

    /* renamed from: b */
    public int f27010b;

    /* renamed from: c */
    public int f27011c;

    /* renamed from: d */
    public int[] f27012d;

    /* renamed from: e */
    public int f27013e;

    public C6936j() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f27009a = r0
            r1 = -1
            r2.f27010b = r1
            r2.f27011c = r0
            r0 = 16
            int[] r0 = new int[r0]
            r2.f27012d = r0
            int r0 = r0.length
            int r0 = r0 + (-1)
            r2.f27013e = r0
            return
    }

    /* renamed from: a */
    public void m14060a(int r7) {
            r6 = this;
            int r0 = r6.f27011c
            int[] r1 = r6.f27012d
            int r2 = r1.length
            if (r0 != r2) goto L30
            int r0 = r1.length
            int r0 = r0 << 1
            if (r0 < 0) goto L2a
            int[] r2 = new int[r0]
            int r3 = r1.length
            int r4 = r6.f27009a
            int r3 = r3 - r4
            r5 = 0
            java.lang.System.arraycopy(r1, r4, r2, r5, r3)
            int[] r1 = r6.f27012d
            java.lang.System.arraycopy(r1, r5, r2, r3, r4)
            r6.f27009a = r5
            int r1 = r6.f27011c
            int r1 = r1 + (-1)
            r6.f27010b = r1
            r6.f27012d = r2
            int r0 = r0 + (-1)
            r6.f27013e = r0
            goto L30
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>()
            throw r7
        L30:
            int r0 = r6.f27010b
            int r0 = r0 + 1
            int r1 = r6.f27013e
            r0 = r0 & r1
            r6.f27010b = r0
            int[] r1 = r6.f27012d
            r1[r0] = r7
            int r7 = r6.f27011c
            int r7 = r7 + 1
            r6.f27011c = r7
            return
    }

    /* renamed from: b */
    public int m14061b() {
            r4 = this;
            int r0 = r4.f27011c
            if (r0 == 0) goto L16
            int[] r1 = r4.f27012d
            int r2 = r4.f27009a
            r1 = r1[r2]
            int r2 = r2 + 1
            int r3 = r4.f27013e
            r2 = r2 & r3
            r4.f27009a = r2
            int r0 = r0 + (-1)
            r4.f27011c = r0
            return r1
        L16:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }
}
