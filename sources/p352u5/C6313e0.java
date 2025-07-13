package p352u5;

/* renamed from: u5.e0 */
/* loaded from: classes.dex */
public class C6313e0 {

    /* renamed from: h */
    public static final java.util.Comparator<p352u5.C6313e0.b> f24667h = null;

    /* renamed from: i */
    public static final java.util.Comparator<p352u5.C6313e0.b> f24668i = null;

    /* renamed from: a */
    public final int f24669a;

    /* renamed from: b */
    public final java.util.ArrayList<p352u5.C6313e0.b> f24670b;

    /* renamed from: c */
    public final p352u5.C6313e0.b[] f24671c;

    /* renamed from: d */
    public int f24672d;

    /* renamed from: e */
    public int f24673e;

    /* renamed from: f */
    public int f24674f;

    /* renamed from: g */
    public int f24675g;

    /* renamed from: u5.e0$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: u5.e0$b */
    public static class b {

        /* renamed from: a */
        public int f24676a;

        /* renamed from: b */
        public int f24677b;

        /* renamed from: c */
        public float f24678c;

        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        public b(p352u5.C6313e0.a r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            j5.b r0 = p163j5.C3423b.f14811b0
            p352u5.C6313e0.f24667h = r0
            s5.b r0 = p325s5.C5962b.f22925b0
            p352u5.C6313e0.f24668i = r0
            return
    }

    public C6313e0(int r1) {
            r0 = this;
            r0.<init>()
            r0.f24669a = r1
            r1 = 5
            u5.e0$b[] r1 = new p352u5.C6313e0.b[r1]
            r0.f24671c = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f24670b = r1
            r1 = -1
            r0.f24672d = r1
            return
    }

    /* renamed from: a */
    public void m12957a(int r4, float r5) {
            r3 = this;
            int r0 = r3.f24672d
            r1 = 1
            if (r0 == r1) goto Le
            java.util.ArrayList<u5.e0$b> r0 = r3.f24670b
            java.util.Comparator<u5.e0$b> r2 = p352u5.C6313e0.f24667h
            java.util.Collections.sort(r0, r2)
            r3.f24672d = r1
        Le:
            int r0 = r3.f24675g
            if (r0 <= 0) goto L1a
            u5.e0$b[] r2 = r3.f24671c
            int r0 = r0 - r1
            r3.f24675g = r0
            r0 = r2[r0]
            goto L20
        L1a:
            u5.e0$b r0 = new u5.e0$b
            r1 = 0
            r0.<init>(r1)
        L20:
            int r1 = r3.f24673e
            int r2 = r1 + 1
            r3.f24673e = r2
            r0.f24676a = r1
            r0.f24677b = r4
            r0.f24678c = r5
            java.util.ArrayList<u5.e0$b> r5 = r3.f24670b
            r5.add(r0)
            int r5 = r3.f24674f
            int r5 = r5 + r4
        L34:
            r3.f24674f = r5
        L36:
            int r4 = r3.f24674f
            int r5 = r3.f24669a
            if (r4 <= r5) goto L69
            int r4 = r4 - r5
            java.util.ArrayList<u5.e0$b> r5 = r3.f24670b
            r0 = 0
            java.lang.Object r5 = r5.get(r0)
            u5.e0$b r5 = (p352u5.C6313e0.b) r5
            int r1 = r5.f24677b
            if (r1 > r4) goto L62
            int r4 = r3.f24674f
            int r4 = r4 - r1
            r3.f24674f = r4
            java.util.ArrayList<u5.e0$b> r4 = r3.f24670b
            r4.remove(r0)
            int r4 = r3.f24675g
            r0 = 5
            if (r4 >= r0) goto L36
            u5.e0$b[] r0 = r3.f24671c
            int r1 = r4 + 1
            r3.f24675g = r1
            r0[r4] = r5
            goto L36
        L62:
            int r1 = r1 - r4
            r5.f24677b = r1
            int r5 = r3.f24674f
            int r5 = r5 - r4
            goto L34
        L69:
            return
    }

    /* renamed from: b */
    public float m12958b(float r5) {
            r4 = this;
            int r0 = r4.f24672d
            r1 = 0
            if (r0 == 0) goto Le
            java.util.ArrayList<u5.e0$b> r0 = r4.f24670b
            java.util.Comparator<u5.e0$b> r2 = p352u5.C6313e0.f24668i
            java.util.Collections.sort(r0, r2)
            r4.f24672d = r1
        Le:
            int r0 = r4.f24674f
            float r0 = (float) r0
            float r5 = r5 * r0
            r0 = 0
        L14:
            java.util.ArrayList<u5.e0$b> r2 = r4.f24670b
            int r2 = r2.size()
            if (r1 >= r2) goto L32
            java.util.ArrayList<u5.e0$b> r2 = r4.f24670b
            java.lang.Object r2 = r2.get(r1)
            u5.e0$b r2 = (p352u5.C6313e0.b) r2
            int r3 = r2.f24677b
            int r0 = r0 + r3
            float r3 = (float) r0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 < 0) goto L2f
            float r5 = r2.f24678c
            return r5
        L2f:
            int r1 = r1 + 1
            goto L14
        L32:
            java.util.ArrayList<u5.e0$b> r5 = r4.f24670b
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3d
            r5 = 2143289344(0x7fc00000, float:NaN)
            goto L4d
        L3d:
            java.util.ArrayList<u5.e0$b> r5 = r4.f24670b
            int r0 = r5.size()
            int r0 = r0 + (-1)
            java.lang.Object r5 = r5.get(r0)
            u5.e0$b r5 = (p352u5.C6313e0.b) r5
            float r5 = r5.f24678c
        L4d:
            return r5
    }
}
