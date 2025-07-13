package p333t1;

/* renamed from: t1.m */
/* loaded from: classes.dex */
public class C6109m extends p333t1.AbstractC6104h {

    /* renamed from: v0 */
    public java.util.ArrayList<p333t1.AbstractC6104h> f23611v0;

    /* renamed from: w0 */
    public boolean f23612w0;

    /* renamed from: x0 */
    public int f23613x0;

    /* renamed from: y0 */
    public boolean f23614y0;

    /* renamed from: z0 */
    public int f23615z0;

    /* renamed from: t1.m$a */
    public class a extends p333t1.C6107k {

        /* renamed from: a */
        public final /* synthetic */ p333t1.AbstractC6104h f23616a;

        public a(p333t1.C6109m r1, p333t1.AbstractC6104h r2) {
                r0 = this;
                r0.f23616a = r2
                r0.<init>()
                return
        }

        @Override // p333t1.AbstractC6104h.d
        /* renamed from: a */
        public void mo12591a(p333t1.AbstractC6104h r2) {
                r1 = this;
                t1.h r0 = r1.f23616a
                r0.mo12607C()
                r2.mo12630z(r1)
                return
        }
    }

    /* renamed from: t1.m$b */
    public static class b extends p333t1.C6107k {

        /* renamed from: a */
        public p333t1.C6109m f23617a;

        public b(p333t1.C6109m r1) {
                r0 = this;
                r0.<init>()
                r0.f23617a = r1
                return
        }

        @Override // p333t1.AbstractC6104h.d
        /* renamed from: a */
        public void mo12591a(p333t1.AbstractC6104h r3) {
                r2 = this;
                t1.m r0 = r2.f23617a
                int r1 = r0.f23613x0
                int r1 = r1 + (-1)
                r0.f23613x0 = r1
                if (r1 != 0) goto L10
                r1 = 0
                r0.f23614y0 = r1
                r0.m12624q()
            L10:
                r3.mo12630z(r2)
                return
        }

        @Override // p333t1.C6107k, p333t1.AbstractC6104h.d
        /* renamed from: b */
        public void mo12598b(p333t1.AbstractC6104h r2) {
                r1 = this;
                t1.m r2 = r1.f23617a
                boolean r0 = r2.f23614y0
                if (r0 != 0) goto Le
                r2.m12614J()
                t1.m r2 = r1.f23617a
                r0 = 1
                r2.f23614y0 = r0
            Le:
                return
        }
    }

    public C6109m() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f23611v0 = r0
            r0 = 1
            r1.f23612w0 = r0
            r0 = 0
            r1.f23614y0 = r0
            r1.f23615z0 = r0
            return
    }

    @Override // p333t1.AbstractC6104h
    /* renamed from: A */
    public p333t1.AbstractC6104h mo12605A(android.view.View r3) {
            r2 = this;
            r0 = 0
        L1:
            java.util.ArrayList<t1.h> r1 = r2.f23611v0
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.ArrayList<t1.h> r1 = r2.f23611v0
            java.lang.Object r1 = r1.get(r0)
            t1.h r1 = (p333t1.AbstractC6104h) r1
            r1.mo12605A(r3)
            int r0 = r0 + 1
            goto L1
        L17:
            java.util.ArrayList<android.view.View> r0 = r2.f23581d0
            r0.remove(r3)
            return r2
    }

    @Override // p333t1.AbstractC6104h
    /* renamed from: B */
    public void mo12606B(android.view.View r4) {
            r3 = this;
            super.mo12606B(r4)
            java.util.ArrayList<t1.h> r0 = r3.f23611v0
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L1a
            java.util.ArrayList<t1.h> r2 = r3.f23611v0
            java.lang.Object r2 = r2.get(r1)
            t1.h r2 = (p333t1.AbstractC6104h) r2
            r2.mo12606B(r4)
            int r1 = r1 + 1
            goto La
        L1a:
            return
    }

    @Override // p333t1.AbstractC6104h
    /* renamed from: C */
    public void mo12607C() {
            r4 = this;
            java.util.ArrayList<t1.h> r0 = r4.f23611v0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lf
            r4.m12614J()
            r4.m12624q()
            return
        Lf:
            t1.m$b r0 = new t1.m$b
            r0.<init>(r4)
            java.util.ArrayList<t1.h> r1 = r4.f23611v0
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r1.next()
            t1.h r2 = (p333t1.AbstractC6104h) r2
            r2.mo12616a(r0)
            goto L1a
        L2a:
            java.util.ArrayList<t1.h> r0 = r4.f23611v0
            int r0 = r0.size()
            r4.f23613x0 = r0
            boolean r0 = r4.f23612w0
            if (r0 != 0) goto L6b
            r0 = 1
        L37:
            java.util.ArrayList<t1.h> r1 = r4.f23611v0
            int r1 = r1.size()
            if (r0 >= r1) goto L5c
            java.util.ArrayList<t1.h> r1 = r4.f23611v0
            int r2 = r0 + (-1)
            java.lang.Object r1 = r1.get(r2)
            t1.h r1 = (p333t1.AbstractC6104h) r1
            java.util.ArrayList<t1.h> r2 = r4.f23611v0
            java.lang.Object r2 = r2.get(r0)
            t1.h r2 = (p333t1.AbstractC6104h) r2
            t1.m$a r3 = new t1.m$a
            r3.<init>(r4, r2)
            r1.mo12616a(r3)
            int r0 = r0 + 1
            goto L37
        L5c:
            java.util.ArrayList<t1.h> r0 = r4.f23611v0
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            t1.h r0 = (p333t1.AbstractC6104h) r0
            if (r0 == 0) goto L81
            r0.mo12607C()
            goto L81
        L6b:
            java.util.ArrayList<t1.h> r0 = r4.f23611v0
            java.util.Iterator r0 = r0.iterator()
        L71:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L81
            java.lang.Object r1 = r0.next()
            t1.h r1 = (p333t1.AbstractC6104h) r1
            r1.mo12607C()
            goto L71
        L81:
            return
    }

    @Override // p333t1.AbstractC6104h
    /* renamed from: D */
    public /* bridge */ /* synthetic */ p333t1.AbstractC6104h mo12608D(long r1) {
            r0 = this;
            r0.m12635O(r1)
            return r0
    }

    @Override // p333t1.AbstractC6104h
    /* renamed from: E */
    public void mo12609E(p333t1.AbstractC6104h.c r4) {
            r3 = this;
            r3.f23594q0 = r4
            int r0 = r3.f23615z0
            r0 = r0 | 8
            r3.f23615z0 = r0
            java.util.ArrayList<t1.h> r0 = r3.f23611v0
            int r0 = r0.size()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L1f
            java.util.ArrayList<t1.h> r2 = r3.f23611v0
            java.lang.Object r2 = r2.get(r1)
            t1.h r2 = (p333t1.AbstractC6104h) r2
            r2.mo12609E(r4)
            int r1 = r1 + 1
            goto Lf
        L1f:
            return
    }

    @Override // p333t1.AbstractC6104h
    /* renamed from: F */
    public /* bridge */ /* synthetic */ p333t1.AbstractC6104h mo12610F(android.animation.TimeInterpolator r1) {
            r0 = this;
            r0.m12636P(r1)
            return r0
    }

    @Override // p333t1.AbstractC6104h
    /* renamed from: G */
    public void mo12611G(p333t1.AbstractC6102f r3) {
            r2 = this;
            if (r3 != 0) goto L5
            t1.f r0 = p333t1.AbstractC6104h.f23574t0
            goto L6
        L5:
            r0 = r3
        L6:
            r2.f23595r0 = r0
            int r0 = r2.f23615z0
            r0 = r0 | 4
            r2.f23615z0 = r0
            java.util.ArrayList<t1.h> r0 = r2.f23611v0
            if (r0 == 0) goto L29
            r0 = 0
        L13:
            java.util.ArrayList<t1.h> r1 = r2.f23611v0
            int r1 = r1.size()
            if (r0 >= r1) goto L29
            java.util.ArrayList<t1.h> r1 = r2.f23611v0
            java.lang.Object r1 = r1.get(r0)
            t1.h r1 = (p333t1.AbstractC6104h) r1
            r1.mo12611G(r3)
            int r0 = r0 + 1
            goto L13
        L29:
            return
    }

    @Override // p333t1.AbstractC6104h
    /* renamed from: H */
    public void mo12612H(p139i1.AbstractC3061d r4) {
            r3 = this;
            int r0 = r3.f23615z0
            r0 = r0 | 2
            r3.f23615z0 = r0
            java.util.ArrayList<t1.h> r0 = r3.f23611v0
            int r0 = r0.size()
            r1 = 0
        Ld:
            if (r1 >= r0) goto L1d
            java.util.ArrayList<t1.h> r2 = r3.f23611v0
            java.lang.Object r2 = r2.get(r1)
            t1.h r2 = (p333t1.AbstractC6104h) r2
            r2.mo12612H(r4)
            int r1 = r1 + 1
            goto Ld
        L1d:
            return
    }

    @Override // p333t1.AbstractC6104h
    /* renamed from: I */
    public p333t1.AbstractC6104h mo12613I(long r1) {
            r0 = this;
            r0.f23577Z = r1
            return r0
    }

    @Override // p333t1.AbstractC6104h
    /* renamed from: K */
    public java.lang.String mo12615K(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = super.mo12615K(r6)
            r1 = 0
        L5:
            java.util.ArrayList<t1.h> r2 = r5.f23611v0
            int r2 = r2.size()
            if (r1 >= r2) goto L3a
            java.lang.String r2 = "\n"
            java.lang.StringBuilder r0 = android.support.v4.media.C0143b.m255a(r0, r2)
            java.util.ArrayList<t1.h> r2 = r5.f23611v0
            java.lang.Object r2 = r2.get(r1)
            t1.h r2 = (p333t1.AbstractC6104h) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            java.lang.String r4 = "  "
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r2 = r2.mo12615K(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            int r1 = r1 + 1
            goto L5
        L3a:
            return r0
    }

    /* renamed from: M */
    public p333t1.C6109m m12633M(p333t1.AbstractC6104h r6) {
            r5 = this;
            java.util.ArrayList<t1.h> r0 = r5.f23611v0
            r0.add(r6)
            r6.f23584g0 = r5
            long r0 = r5.f23578a0
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L12
            r6.mo12608D(r0)
        L12:
            int r0 = r5.f23615z0
            r0 = r0 & 1
            if (r0 == 0) goto L1d
            android.animation.TimeInterpolator r0 = r5.f23579b0
            r6.mo12610F(r0)
        L1d:
            int r0 = r5.f23615z0
            r0 = r0 & 2
            if (r0 == 0) goto L27
            r0 = 0
            r6.mo12612H(r0)
        L27:
            int r0 = r5.f23615z0
            r0 = r0 & 4
            if (r0 == 0) goto L32
            t1.f r0 = r5.f23595r0
            r6.mo12611G(r0)
        L32:
            int r0 = r5.f23615z0
            r0 = r0 & 8
            if (r0 == 0) goto L3d
            t1.h$c r0 = r5.f23594q0
            r6.mo12609E(r0)
        L3d:
            return r5
    }

    /* renamed from: N */
    public p333t1.AbstractC6104h m12634N(int r2) {
            r1 = this;
            if (r2 < 0) goto L14
            java.util.ArrayList<t1.h> r0 = r1.f23611v0
            int r0 = r0.size()
            if (r2 < r0) goto Lb
            goto L14
        Lb:
            java.util.ArrayList<t1.h> r0 = r1.f23611v0
            java.lang.Object r2 = r0.get(r2)
            t1.h r2 = (p333t1.AbstractC6104h) r2
            return r2
        L14:
            r2 = 0
            return r2
    }

    /* renamed from: O */
    public p333t1.C6109m m12635O(long r4) {
            r3 = this;
            r3.f23578a0 = r4
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L21
            java.util.ArrayList<t1.h> r0 = r3.f23611v0
            if (r0 == 0) goto L21
            int r0 = r0.size()
            r1 = 0
        L11:
            if (r1 >= r0) goto L21
            java.util.ArrayList<t1.h> r2 = r3.f23611v0
            java.lang.Object r2 = r2.get(r1)
            t1.h r2 = (p333t1.AbstractC6104h) r2
            r2.mo12608D(r4)
            int r1 = r1 + 1
            goto L11
        L21:
            return r3
    }

    /* renamed from: P */
    public p333t1.C6109m m12636P(android.animation.TimeInterpolator r4) {
            r3 = this;
            int r0 = r3.f23615z0
            r0 = r0 | 1
            r3.f23615z0 = r0
            java.util.ArrayList<t1.h> r0 = r3.f23611v0
            if (r0 == 0) goto L1f
            int r0 = r0.size()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L1f
            java.util.ArrayList<t1.h> r2 = r3.f23611v0
            java.lang.Object r2 = r2.get(r1)
            t1.h r2 = (p333t1.AbstractC6104h) r2
            r2.mo12610F(r4)
            int r1 = r1 + 1
            goto Lf
        L1f:
            r3.f23579b0 = r4
            return r3
    }

    /* renamed from: R */
    public p333t1.C6109m m12637R(int r3) {
            r2 = this;
            r0 = 1
            if (r3 == 0) goto L15
            if (r3 != r0) goto L9
            r3 = 0
            r2.f23612w0 = r3
            goto L17
        L9:
            android.util.AndroidRuntimeException r0 = new android.util.AndroidRuntimeException
            java.lang.String r1 = "Invalid parameter for TransitionSet ordering: "
            java.lang.String r3 = android.support.v4.media.C0142a.m254a(r1, r3)
            r0.<init>(r3)
            throw r0
        L15:
            r2.f23612w0 = r0
        L17:
            return r2
    }

    @Override // p333t1.AbstractC6104h
    /* renamed from: a */
    public p333t1.AbstractC6104h mo12616a(p333t1.AbstractC6104h.d r1) {
            r0 = this;
            super.mo12616a(r1)
            return r0
    }

    @Override // p333t1.AbstractC6104h
    /* renamed from: b */
    public p333t1.AbstractC6104h mo12617b(android.view.View r3) {
            r2 = this;
            r0 = 0
        L1:
            java.util.ArrayList<t1.h> r1 = r2.f23611v0
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.ArrayList<t1.h> r1 = r2.f23611v0
            java.lang.Object r1 = r1.get(r0)
            t1.h r1 = (p333t1.AbstractC6104h) r1
            r1.mo12617b(r3)
            int r0 = r0 + 1
            goto L1
        L17:
            java.util.ArrayList<android.view.View> r0 = r2.f23581d0
            r0.add(r3)
            return r2
    }

    @Override // p333t1.AbstractC6104h
    public void cancel() {
            r3 = this;
            super.cancel()
            java.util.ArrayList<t1.h> r0 = r3.f23611v0
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L1a
            java.util.ArrayList<t1.h> r2 = r3.f23611v0
            java.lang.Object r2 = r2.get(r1)
            t1.h r2 = (p333t1.AbstractC6104h) r2
            r2.cancel()
            int r1 = r1 + 1
            goto La
        L1a:
            return
    }

    @Override // p333t1.AbstractC6104h
    public /* bridge */ /* synthetic */ java.lang.Object clone() {
            r1 = this;
            t1.h r0 = r1.mo12622m()
            return r0
    }

    @Override // p333t1.AbstractC6104h
    /* renamed from: d */
    public void mo9875d(p333t1.C6111o r4) {
            r3 = this;
            android.view.View r0 = r4.f23622b
            boolean r0 = r3.m12628w(r0)
            if (r0 == 0) goto L2b
            java.util.ArrayList<t1.h> r0 = r3.f23611v0
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            t1.h r1 = (p333t1.AbstractC6104h) r1
            android.view.View r2 = r4.f23622b
            boolean r2 = r1.m12628w(r2)
            if (r2 == 0) goto Le
            r1.mo9875d(r4)
            java.util.ArrayList<t1.h> r2 = r4.f23623c
            r2.add(r1)
            goto Le
        L2b:
            return
    }

    @Override // p333t1.AbstractC6104h
    /* renamed from: f */
    public void mo12619f(p333t1.C6111o r4) {
            r3 = this;
            java.util.ArrayList<t1.h> r0 = r3.f23611v0
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L17
            java.util.ArrayList<t1.h> r2 = r3.f23611v0
            java.lang.Object r2 = r2.get(r1)
            t1.h r2 = (p333t1.AbstractC6104h) r2
            r2.mo12619f(r4)
            int r1 = r1 + 1
            goto L7
        L17:
            return
    }

    @Override // p333t1.AbstractC6104h
    /* renamed from: g */
    public void mo9876g(p333t1.C6111o r4) {
            r3 = this;
            android.view.View r0 = r4.f23622b
            boolean r0 = r3.m12628w(r0)
            if (r0 == 0) goto L2b
            java.util.ArrayList<t1.h> r0 = r3.f23611v0
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            t1.h r1 = (p333t1.AbstractC6104h) r1
            android.view.View r2 = r4.f23622b
            boolean r2 = r1.m12628w(r2)
            if (r2 == 0) goto Le
            r1.mo9876g(r4)
            java.util.ArrayList<t1.h> r2 = r4.f23623c
            r2.add(r1)
            goto Le
        L2b:
            return
    }

    @Override // p333t1.AbstractC6104h
    /* renamed from: m */
    public p333t1.AbstractC6104h mo12622m() {
            r5 = this;
            t1.h r0 = super.mo12622m()
            t1.m r0 = (p333t1.C6109m) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f23611v0 = r1
            java.util.ArrayList<t1.h> r1 = r5.f23611v0
            int r1 = r1.size()
            r2 = 0
        L14:
            if (r2 >= r1) goto L2c
            java.util.ArrayList<t1.h> r3 = r5.f23611v0
            java.lang.Object r3 = r3.get(r2)
            t1.h r3 = (p333t1.AbstractC6104h) r3
            t1.h r3 = r3.mo12622m()
            java.util.ArrayList<t1.h> r4 = r0.f23611v0
            r4.add(r3)
            r3.f23584g0 = r0
            int r2 = r2 + 1
            goto L14
        L2c:
            return r0
    }

    @Override // p333t1.AbstractC6104h
    /* renamed from: p */
    public void mo12623p(android.view.ViewGroup r13, p365v.C6476c r14, p365v.C6476c r15, java.util.ArrayList<p333t1.C6111o> r16, java.util.ArrayList<p333t1.C6111o> r17) {
            r12 = this;
            r0 = r12
            long r1 = r0.f23577Z
            java.util.ArrayList<t1.h> r3 = r0.f23611v0
            int r3 = r3.size()
            r4 = 0
        La:
            if (r4 >= r3) goto L3c
            java.util.ArrayList<t1.h> r5 = r0.f23611v0
            java.lang.Object r5 = r5.get(r4)
            r6 = r5
            t1.h r6 = (p333t1.AbstractC6104h) r6
            r7 = 0
            int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r5 <= 0) goto L2f
            boolean r5 = r0.f23612w0
            if (r5 != 0) goto L21
            if (r4 != 0) goto L2f
        L21:
            long r9 = r6.f23577Z
            int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r5 <= 0) goto L2c
            long r9 = r9 + r1
            r6.mo12613I(r9)
            goto L2f
        L2c:
            r6.mo12613I(r1)
        L2f:
            r7 = r13
            r8 = r14
            r9 = r15
            r10 = r16
            r11 = r17
            r6.mo12623p(r7, r8, r9, r10, r11)
            int r4 = r4 + 1
            goto La
        L3c:
            return
    }

    @Override // p333t1.AbstractC6104h
    /* renamed from: y */
    public void mo12629y(android.view.View r4) {
            r3 = this;
            super.mo12629y(r4)
            java.util.ArrayList<t1.h> r0 = r3.f23611v0
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L1a
            java.util.ArrayList<t1.h> r2 = r3.f23611v0
            java.lang.Object r2 = r2.get(r1)
            t1.h r2 = (p333t1.AbstractC6104h) r2
            r2.mo12629y(r4)
            int r1 = r1 + 1
            goto La
        L1a:
            return
    }

    @Override // p333t1.AbstractC6104h
    /* renamed from: z */
    public p333t1.AbstractC6104h mo12630z(p333t1.AbstractC6104h.d r1) {
            r0 = this;
            super.mo12630z(r1)
            return r0
    }
}
