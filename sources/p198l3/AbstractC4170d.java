package p198l3;

import p267p3.InterfaceC5350d;

/* renamed from: l3.d */
/* loaded from: classes.dex */
public abstract class AbstractC4170d<T extends p267p3.InterfaceC5350d<? extends p198l3.C4172f>> {

    /* renamed from: a */
    public float f17270a;

    /* renamed from: b */
    public float f17271b;

    /* renamed from: c */
    public float f17272c;

    /* renamed from: d */
    public float f17273d;

    /* renamed from: e */
    public float f17274e;

    /* renamed from: f */
    public float f17275f;

    /* renamed from: g */
    public float f17276g;

    /* renamed from: h */
    public float f17277h;

    /* renamed from: i */
    public java.util.List<T> f17278i;

    public AbstractC4170d() {
            r2 = this;
            r2.<init>()
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r2.f17270a = r0
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r2.f17271b = r1
            r2.f17272c = r0
            r2.f17273d = r1
            r2.f17274e = r0
            r2.f17275f = r1
            r2.f17276g = r0
            r2.f17277h = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f17278i = r0
            return
    }

    public AbstractC4170d(T... r5) {
            r4 = this;
            r4.<init>()
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r4.f17270a = r0
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r4.f17271b = r1
            r4.f17272c = r0
            r4.f17273d = r1
            r4.f17274e = r0
            r4.f17275f = r1
            r4.f17276g = r0
            r4.f17277h = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r5.length
            r2 = 0
        L20:
            if (r2 >= r1) goto L2a
            r3 = r5[r2]
            r0.add(r3)
            int r2 = r2 + 1
            goto L20
        L2a:
            r4.f17278i = r0
            r4.m9247a()
            return
    }

    /* renamed from: a */
    public void m9247a() {
            r8 = this;
            k3.i$a r0 = p181k3.C3685i.a.f16313Z
            k3.i$a r1 = p181k3.C3685i.a.f16312Y
            java.util.List<T extends p3.d<? extends l3.f>> r2 = r8.f17278i
            if (r2 != 0) goto L9
            return
        L9:
            r3 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r8.f17270a = r3
            r4 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r8.f17271b = r4
            r8.f17272c = r3
            r8.f17273d = r4
            java.util.Iterator r2 = r2.iterator()
        L1b:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto Lb0
            java.lang.Object r5 = r2.next()
            p3.d r5 = (p267p3.InterfaceC5350d) r5
            float r6 = r8.f17270a
            float r7 = r5.mo9260j()
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L37
            float r6 = r5.mo9260j()
            r8.f17270a = r6
        L37:
            float r6 = r8.f17271b
            float r7 = r5.mo9254A()
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L47
            float r6 = r5.mo9254A()
            r8.f17271b = r6
        L47:
            float r6 = r8.f17272c
            float r7 = r5.mo9266y()
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L57
            float r6 = r5.mo9266y()
            r8.f17272c = r6
        L57:
            float r6 = r8.f17273d
            float r7 = r5.mo9257g()
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L67
            float r6 = r5.mo9257g()
            r8.f17273d = r6
        L67:
            k3.i$a r6 = r5.mo9228L()
            if (r6 != r1) goto L8e
            float r6 = r8.f17274e
            float r7 = r5.mo9260j()
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L7d
            float r6 = r5.mo9260j()
            r8.f17274e = r6
        L7d:
            float r6 = r8.f17275f
            float r7 = r5.mo9254A()
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L1b
            float r5 = r5.mo9254A()
            r8.f17275f = r5
            goto L1b
        L8e:
            float r6 = r8.f17276g
            float r7 = r5.mo9260j()
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L9e
            float r6 = r5.mo9260j()
            r8.f17276g = r6
        L9e:
            float r6 = r8.f17277h
            float r7 = r5.mo9254A()
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L1b
            float r5 = r5.mo9254A()
            r8.f17277h = r5
            goto L1b
        Lb0:
            r8.f17274e = r3
            r8.f17275f = r4
            r8.f17276g = r3
            r8.f17277h = r4
            java.util.List<T extends p3.d<? extends l3.f>> r2 = r8.f17278i
            java.util.Iterator r2 = r2.iterator()
        Lbe:
            boolean r3 = r2.hasNext()
            r4 = 0
            if (r3 == 0) goto Ld2
            java.lang.Object r3 = r2.next()
            p3.d r3 = (p267p3.InterfaceC5350d) r3
            k3.i$a r5 = r3.mo9228L()
            if (r5 != r1) goto Lbe
            goto Ld3
        Ld2:
            r3 = r4
        Ld3:
            if (r3 == 0) goto L11a
            float r2 = r3.mo9260j()
            r8.f17274e = r2
            float r2 = r3.mo9254A()
            r8.f17275f = r2
            java.util.List<T extends p3.d<? extends l3.f>> r2 = r8.f17278i
            java.util.Iterator r2 = r2.iterator()
        Le7:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L11a
            java.lang.Object r3 = r2.next()
            p3.d r3 = (p267p3.InterfaceC5350d) r3
            k3.i$a r5 = r3.mo9228L()
            if (r5 != r1) goto Le7
            float r5 = r3.mo9254A()
            float r6 = r8.f17275f
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L109
            float r5 = r3.mo9254A()
            r8.f17275f = r5
        L109:
            float r5 = r3.mo9260j()
            float r6 = r8.f17274e
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto Le7
            float r3 = r3.mo9260j()
            r8.f17274e = r3
            goto Le7
        L11a:
            java.util.List<T extends p3.d<? extends l3.f>> r1 = r8.f17278i
            java.util.Iterator r1 = r1.iterator()
        L120:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L133
            java.lang.Object r2 = r1.next()
            p3.d r2 = (p267p3.InterfaceC5350d) r2
            k3.i$a r3 = r2.mo9228L()
            if (r3 != r0) goto L120
            r4 = r2
        L133:
            if (r4 == 0) goto L17a
            float r1 = r4.mo9260j()
            r8.f17276g = r1
            float r1 = r4.mo9254A()
            r8.f17277h = r1
            java.util.List<T extends p3.d<? extends l3.f>> r1 = r8.f17278i
            java.util.Iterator r1 = r1.iterator()
        L147:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L17a
            java.lang.Object r2 = r1.next()
            p3.d r2 = (p267p3.InterfaceC5350d) r2
            k3.i$a r3 = r2.mo9228L()
            if (r3 != r0) goto L147
            float r3 = r2.mo9254A()
            float r4 = r8.f17277h
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L169
            float r3 = r2.mo9254A()
            r8.f17277h = r3
        L169:
            float r3 = r2.mo9260j()
            float r4 = r8.f17276g
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L147
            float r2 = r2.mo9260j()
            r8.f17276g = r2
            goto L147
        L17a:
            return
    }

    /* renamed from: b */
    public T m9248b(int r2) {
            r1 = this;
            java.util.List<T extends p3.d<? extends l3.f>> r0 = r1.f17278i
            if (r0 == 0) goto L16
            if (r2 < 0) goto L16
            int r0 = r0.size()
            if (r2 < r0) goto Ld
            goto L16
        Ld:
            java.util.List<T extends p3.d<? extends l3.f>> r0 = r1.f17278i
            java.lang.Object r2 = r0.get(r2)
            p3.d r2 = (p267p3.InterfaceC5350d) r2
            return r2
        L16:
            r2 = 0
            return r2
    }

    /* renamed from: c */
    public int m9249c() {
            r1 = this;
            java.util.List<T extends p3.d<? extends l3.f>> r0 = r1.f17278i
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.size()
            return r0
    }

    /* renamed from: d */
    public int m9250d() {
            r3 = this;
            java.util.List<T extends p3.d<? extends l3.f>> r0 = r3.f17278i
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L19
            java.lang.Object r2 = r0.next()
            p3.d r2 = (p267p3.InterfaceC5350d) r2
            int r2 = r2.mo9255P()
            int r1 = r1 + r2
            goto L7
        L19:
            return r1
    }

    /* renamed from: e */
    public p198l3.C4172f m9251e(p230n3.C4684b r3) {
            r2 = this;
            int r0 = r3.f18656f
            java.util.List<T extends p3.d<? extends l3.f>> r1 = r2.f17278i
            int r1 = r1.size()
            if (r0 < r1) goto Lc
            r3 = 0
            return r3
        Lc:
            java.util.List<T extends p3.d<? extends l3.f>> r0 = r2.f17278i
            int r1 = r3.f18656f
            java.lang.Object r0 = r0.get(r1)
            p3.d r0 = (p267p3.InterfaceC5350d) r0
            float r1 = r3.f18651a
            float r3 = r3.f18652b
            l3.f r3 = r0.mo9261p(r1, r3)
            return r3
    }

    /* renamed from: f */
    public float m9252f(p181k3.C3685i.a r3) {
            r2 = this;
            k3.i$a r0 = p181k3.C3685i.a.f16312Y
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            if (r3 != r0) goto L10
            float r3 = r2.f17274e
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto Lf
            float r3 = r2.f17276g
        Lf:
            return r3
        L10:
            float r3 = r2.f17276g
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L18
            float r3 = r2.f17274e
        L18:
            return r3
    }

    /* renamed from: g */
    public float m9253g(p181k3.C3685i.a r3) {
            r2 = this;
            k3.i$a r0 = p181k3.C3685i.a.f16312Y
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            if (r3 != r0) goto L10
            float r3 = r2.f17275f
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto Lf
            float r3 = r2.f17277h
        Lf:
            return r3
        L10:
            float r3 = r2.f17277h
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L18
            float r3 = r2.f17275f
        L18:
            return r3
    }
}
