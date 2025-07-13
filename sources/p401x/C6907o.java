package p401x;

/* renamed from: x.o */
/* loaded from: classes.dex */
public class C6907o {

    /* renamed from: f */
    public static int f26848f;

    /* renamed from: a */
    public java.util.ArrayList<p381w.C6765f> f26849a;

    /* renamed from: b */
    public int f26850b;

    /* renamed from: c */
    public int f26851c;

    /* renamed from: d */
    public java.util.ArrayList<p401x.C6907o.a> f26852d;

    /* renamed from: e */
    public int f26853e;

    /* renamed from: x.o$a */
    public class a {
        public a(p401x.C6907o r1, p381w.C6765f r2, p365v.C6477d r3, int r4) {
                r0 = this;
                r0.<init>()
                java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
                r1.<init>(r2)
                w.d r1 = r2.f26114F
                r3.m13137o(r1)
                w.d r1 = r2.f26116G
                r3.m13137o(r1)
                w.d r1 = r2.f26118H
                r3.m13137o(r1)
                w.d r1 = r2.f26119I
                r3.m13137o(r1)
                w.d r1 = r2.f26120J
                r3.m13137o(r1)
                return
        }
    }

    public C6907o(int r3) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f26849a = r0
            r0 = -1
            r2.f26850b = r0
            r1 = 0
            r2.f26851c = r1
            r1 = 0
            r2.f26852d = r1
            r2.f26853e = r0
            int r0 = p401x.C6907o.f26848f
            int r1 = r0 + 1
            p401x.C6907o.f26848f = r1
            r2.f26850b = r0
            r2.f26851c = r3
            return
    }

    /* renamed from: a */
    public boolean m13998a(p381w.C6765f r2) {
            r1 = this;
            java.util.ArrayList<w.f> r0 = r1.f26849a
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto La
            r2 = 0
            return r2
        La:
            java.util.ArrayList<w.f> r0 = r1.f26849a
            r0.add(r2)
            r2 = 1
            return r2
    }

    /* renamed from: b */
    public void m13999b(java.util.ArrayList<p401x.C6907o> r6) {
            r5 = this;
            java.util.ArrayList<w.f> r0 = r5.f26849a
            int r0 = r0.size()
            int r1 = r5.f26853e
            r2 = -1
            if (r1 == r2) goto L28
            if (r0 <= 0) goto L28
            r1 = 0
        Le:
            int r2 = r6.size()
            if (r1 >= r2) goto L28
            java.lang.Object r2 = r6.get(r1)
            x.o r2 = (p401x.C6907o) r2
            int r3 = r5.f26853e
            int r4 = r2.f26850b
            if (r3 != r4) goto L25
            int r3 = r5.f26851c
            r5.m14001d(r3, r2)
        L25:
            int r1 = r1 + 1
            goto Le
        L28:
            if (r0 != 0) goto L2d
            r6.remove(r5)
        L2d:
            return
    }

    /* renamed from: c */
    public int m14000c(p365v.C6477d r6, int r7) {
            r5 = this;
            java.util.ArrayList<w.f> r0 = r5.f26849a
            int r0 = r0.size()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            java.util.ArrayList<w.f> r0 = r5.f26849a
            java.lang.Object r2 = r0.get(r1)
            w.f r2 = (p381w.C6765f) r2
            w.f r2 = r2.f26128R
            w.g r2 = (p381w.C6766g) r2
            r6.m13143u()
            r2.mo13674f(r6, r1)
            r3 = 0
        L1d:
            int r4 = r0.size()
            if (r3 >= r4) goto L2f
            java.lang.Object r4 = r0.get(r3)
            w.f r4 = (p381w.C6765f) r4
            r4.mo13674f(r6, r1)
            int r3 = r3 + 1
            goto L1d
        L2f:
            if (r7 != 0) goto L38
            int r3 = r2.f26201P0
            if (r3 <= 0) goto L38
            p381w.C6761b.m13677a(r2, r6, r0, r1)
        L38:
            r3 = 1
            if (r7 != r3) goto L42
            int r4 = r2.f26202Q0
            if (r4 <= 0) goto L42
            p381w.C6761b.m13677a(r2, r6, r0, r3)
        L42:
            r6.m13139q()     // Catch: java.lang.Exception -> L46
            goto L4a
        L46:
            r3 = move-exception
            r3.printStackTrace()
        L4a:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r5.f26852d = r3
        L51:
            int r3 = r0.size()
            if (r1 >= r3) goto L6a
            java.lang.Object r3 = r0.get(r1)
            w.f r3 = (p381w.C6765f) r3
            x.o$a r4 = new x.o$a
            r4.<init>(r5, r3, r6, r7)
            java.util.ArrayList<x.o$a> r3 = r5.f26852d
            r3.add(r4)
            int r1 = r1 + 1
            goto L51
        L6a:
            if (r7 != 0) goto L75
            w.d r7 = r2.f26114F
            int r7 = r6.m13137o(r7)
            w.d r0 = r2.f26118H
            goto L7d
        L75:
            w.d r7 = r2.f26116G
            int r7 = r6.m13137o(r7)
            w.d r0 = r2.f26119I
        L7d:
            int r0 = r6.m13137o(r0)
            r6.m13143u()
            int r0 = r0 - r7
            return r0
    }

    /* renamed from: d */
    public void m14001d(int r4, p401x.C6907o r5) {
            r3 = this;
            java.util.ArrayList<w.f> r0 = r3.f26849a
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()
            w.f r1 = (p381w.C6765f) r1
            r5.m13998a(r1)
            if (r4 != 0) goto L1c
            int r2 = r5.f26850b
            r1.f26115F0 = r2
            goto L6
        L1c:
            int r2 = r5.f26850b
            r1.f26117G0 = r2
            goto L6
        L21:
            int r4 = r5.f26850b
            r3.f26853e = r4
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r4.f26851c
            if (r1 != 0) goto Lc
            java.lang.String r1 = "Horizontal"
            goto L1a
        Lc:
            r2 = 1
            if (r1 != r2) goto L12
            java.lang.String r1 = "Vertical"
            goto L1a
        L12:
            r2 = 2
            if (r1 != r2) goto L18
            java.lang.String r1 = "Both"
            goto L1a
        L18:
            java.lang.String r1 = "Unknown"
        L1a:
            r0.append(r1)
            java.lang.String r1 = " ["
            r0.append(r1)
            int r1 = r4.f26850b
            java.lang.String r2 = "] <"
            java.lang.String r0 = p381w.C6764e.m13690a(r0, r1, r2)
            java.util.ArrayList<w.f> r1 = r4.f26849a
            java.util.Iterator r1 = r1.iterator()
        L30:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4c
            java.lang.Object r2 = r1.next()
            w.f r2 = (p381w.C6765f) r2
            java.lang.String r3 = " "
            java.lang.StringBuilder r0 = android.support.v4.media.C0143b.m255a(r0, r3)
            java.lang.String r2 = r2.f26158k0
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            goto L30
        L4c:
            java.lang.String r1 = " >"
            java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
            return r0
    }
}
