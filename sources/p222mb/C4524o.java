package p222mb;

/* renamed from: mb.o */
/* loaded from: classes.dex */
public final class C4524o {

    /* renamed from: A */
    public static final p169jb.InterfaceC3458a0 f18371A = null;

    /* renamed from: B */
    public static final p169jb.InterfaceC3458a0 f18372B = null;

    /* renamed from: C */
    public static final p169jb.AbstractC3483z<p169jb.AbstractC3473p> f18373C = null;

    /* renamed from: D */
    public static final p169jb.InterfaceC3458a0 f18374D = null;

    /* renamed from: E */
    public static final p169jb.InterfaceC3458a0 f18375E = null;

    /* renamed from: a */
    public static final p169jb.InterfaceC3458a0 f18376a = null;

    /* renamed from: b */
    public static final p169jb.InterfaceC3458a0 f18377b = null;

    /* renamed from: c */
    public static final p169jb.AbstractC3483z<java.lang.Boolean> f18378c = null;

    /* renamed from: d */
    public static final p169jb.InterfaceC3458a0 f18379d = null;

    /* renamed from: e */
    public static final p169jb.InterfaceC3458a0 f18380e = null;

    /* renamed from: f */
    public static final p169jb.InterfaceC3458a0 f18381f = null;

    /* renamed from: g */
    public static final p169jb.InterfaceC3458a0 f18382g = null;

    /* renamed from: h */
    public static final p169jb.InterfaceC3458a0 f18383h = null;

    /* renamed from: i */
    public static final p169jb.InterfaceC3458a0 f18384i = null;

    /* renamed from: j */
    public static final p169jb.InterfaceC3458a0 f18385j = null;

    /* renamed from: k */
    public static final p169jb.AbstractC3483z<java.lang.Number> f18386k = null;

    /* renamed from: l */
    public static final p169jb.AbstractC3483z<java.lang.Number> f18387l = null;

    /* renamed from: m */
    public static final p169jb.AbstractC3483z<java.lang.Number> f18388m = null;

    /* renamed from: n */
    public static final p169jb.InterfaceC3458a0 f18389n = null;

    /* renamed from: o */
    public static final p169jb.InterfaceC3458a0 f18390o = null;

    /* renamed from: p */
    public static final p169jb.AbstractC3483z<java.math.BigDecimal> f18391p = null;

    /* renamed from: q */
    public static final p169jb.AbstractC3483z<java.math.BigInteger> f18392q = null;

    /* renamed from: r */
    public static final p169jb.InterfaceC3458a0 f18393r = null;

    /* renamed from: s */
    public static final p169jb.InterfaceC3458a0 f18394s = null;

    /* renamed from: t */
    public static final p169jb.InterfaceC3458a0 f18395t = null;

    /* renamed from: u */
    public static final p169jb.InterfaceC3458a0 f18396u = null;

    /* renamed from: v */
    public static final p169jb.InterfaceC3458a0 f18397v = null;

    /* renamed from: w */
    public static final p169jb.InterfaceC3458a0 f18398w = null;

    /* renamed from: x */
    public static final p169jb.InterfaceC3458a0 f18399x = null;

    /* renamed from: y */
    public static final p169jb.InterfaceC3458a0 f18400y = null;

    /* renamed from: z */
    public static final p169jb.InterfaceC3458a0 f18401z = null;

    /* renamed from: mb.o$a */
    public class a extends p169jb.AbstractC3483z<java.util.concurrent.atomic.AtomicIntegerArray> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: a */
        public java.util.concurrent.atomic.AtomicIntegerArray mo7919a(p290qb.C5612a r5) {
                r4 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r5.mo10406a()
            L8:
                boolean r1 = r5.mo10403Q()
                if (r1 == 0) goto L21
                int r1 = r5.mo10407b0()     // Catch: java.lang.NumberFormatException -> L1a
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L1a
                r0.add(r1)     // Catch: java.lang.NumberFormatException -> L1a
                goto L8
            L1a:
                r5 = move-exception
                jb.w r0 = new jb.w
                r0.<init>(r5)
                throw r0
            L21:
                r5.mo10412n()
                int r5 = r0.size()
                java.util.concurrent.atomic.AtomicIntegerArray r1 = new java.util.concurrent.atomic.AtomicIntegerArray
                r1.<init>(r5)
                r2 = 0
            L2e:
                if (r2 >= r5) goto L40
                java.lang.Object r3 = r0.get(r2)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                r1.set(r2, r3)
                int r2 = r2 + 1
                goto L2e
            L40:
                return r1
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: b */
        public void mo7920b(p290qb.C5614c r5, java.util.concurrent.atomic.AtomicIntegerArray r6) {
                r4 = this;
                java.util.concurrent.atomic.AtomicIntegerArray r6 = (java.util.concurrent.atomic.AtomicIntegerArray) r6
                r5.mo10420h()
                int r0 = r6.length()
                r1 = 0
            La:
                if (r1 >= r0) goto L17
                int r2 = r6.get(r1)
                long r2 = (long) r2
                r5.mo10418d0(r2)
                int r1 = r1 + 1
                goto La
            L17:
                r5.mo10424n()
                return
        }
    }

    /* renamed from: mb.o$a0 */
    public class a0 extends p169jb.AbstractC3483z<java.lang.Number> {
        public a0() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: a */
        public java.lang.Number mo7919a(p290qb.C5612a r3) {
                r2 = this;
                qb.b r0 = r3.mo10414z0()
                qb.b r1 = p290qb.EnumC5613b.f21798g0
                if (r0 != r1) goto Ld
                r3.mo10411m0()
                r3 = 0
                goto L16
            Ld:
                int r3 = r3.mo10407b0()     // Catch: java.lang.NumberFormatException -> L17
                short r3 = (short) r3     // Catch: java.lang.NumberFormatException -> L17
                java.lang.Short r3 = java.lang.Short.valueOf(r3)     // Catch: java.lang.NumberFormatException -> L17
            L16:
                return r3
            L17:
                r3 = move-exception
                jb.w r0 = new jb.w
                r0.<init>(r3)
                throw r0
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: b */
        public void mo7920b(p290qb.C5614c r1, java.lang.Number r2) {
                r0 = this;
                java.lang.Number r2 = (java.lang.Number) r2
                r1.mo10422i0(r2)
                return
        }
    }

    /* renamed from: mb.o$b */
    public class b extends p169jb.AbstractC3483z<java.lang.Number> {
        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: a */
        public java.lang.Number mo7919a(p290qb.C5612a r3) {
                r2 = this;
                qb.b r0 = r3.mo10414z0()
                qb.b r1 = p290qb.EnumC5613b.f21798g0
                if (r0 != r1) goto Ld
                r3.mo10411m0()
                r3 = 0
                goto L15
            Ld:
                long r0 = r3.mo10408d0()     // Catch: java.lang.NumberFormatException -> L16
                java.lang.Long r3 = java.lang.Long.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L16
            L15:
                return r3
            L16:
                r3 = move-exception
                jb.w r0 = new jb.w
                r0.<init>(r3)
                throw r0
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: b */
        public void mo7920b(p290qb.C5614c r1, java.lang.Number r2) {
                r0 = this;
                java.lang.Number r2 = (java.lang.Number) r2
                r1.mo10422i0(r2)
                return
        }
    }

    /* renamed from: mb.o$b0 */
    public class b0 extends p169jb.AbstractC3483z<java.lang.Number> {
        public b0() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: a */
        public java.lang.Number mo7919a(p290qb.C5612a r3) {
                r2 = this;
                qb.b r0 = r3.mo10414z0()
                qb.b r1 = p290qb.EnumC5613b.f21798g0
                if (r0 != r1) goto Ld
                r3.mo10411m0()
                r3 = 0
                goto L15
            Ld:
                int r3 = r3.mo10407b0()     // Catch: java.lang.NumberFormatException -> L16
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.NumberFormatException -> L16
            L15:
                return r3
            L16:
                r3 = move-exception
                jb.w r0 = new jb.w
                r0.<init>(r3)
                throw r0
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: b */
        public void mo7920b(p290qb.C5614c r1, java.lang.Number r2) {
                r0 = this;
                java.lang.Number r2 = (java.lang.Number) r2
                r1.mo10422i0(r2)
                return
        }
    }

    /* renamed from: mb.o$c */
    public class c extends p169jb.AbstractC3483z<java.lang.Number> {
        public c() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: a */
        public java.lang.Number mo7919a(p290qb.C5612a r3) {
                r2 = this;
                qb.b r0 = r3.mo10414z0()
                qb.b r1 = p290qb.EnumC5613b.f21798g0
                if (r0 != r1) goto Ld
                r3.mo10411m0()
                r3 = 0
                goto L16
            Ld:
                double r0 = r3.mo10405Z()
                float r3 = (float) r0
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
            L16:
                return r3
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: b */
        public void mo7920b(p290qb.C5614c r1, java.lang.Number r2) {
                r0 = this;
                java.lang.Number r2 = (java.lang.Number) r2
                r1.mo10422i0(r2)
                return
        }
    }

    /* renamed from: mb.o$c0 */
    public class c0 extends p169jb.AbstractC3483z<java.util.concurrent.atomic.AtomicInteger> {
        public c0() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: a */
        public java.util.concurrent.atomic.AtomicInteger mo7919a(p290qb.C5612a r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger     // Catch: java.lang.NumberFormatException -> La
                int r2 = r2.mo10407b0()     // Catch: java.lang.NumberFormatException -> La
                r0.<init>(r2)     // Catch: java.lang.NumberFormatException -> La
                return r0
            La:
                r2 = move-exception
                jb.w r0 = new jb.w
                r0.<init>(r2)
                throw r0
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: b */
        public void mo7920b(p290qb.C5614c r3, java.util.concurrent.atomic.AtomicInteger r4) {
                r2 = this;
                java.util.concurrent.atomic.AtomicInteger r4 = (java.util.concurrent.atomic.AtomicInteger) r4
                int r4 = r4.get()
                long r0 = (long) r4
                r3.mo10418d0(r0)
                return
        }
    }

    /* renamed from: mb.o$d */
    public class d extends p169jb.AbstractC3483z<java.lang.Number> {
        public d() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: a */
        public java.lang.Number mo7919a(p290qb.C5612a r3) {
                r2 = this;
                qb.b r0 = r3.mo10414z0()
                qb.b r1 = p290qb.EnumC5613b.f21798g0
                if (r0 != r1) goto Ld
                r3.mo10411m0()
                r3 = 0
                goto L15
            Ld:
                double r0 = r3.mo10405Z()
                java.lang.Double r3 = java.lang.Double.valueOf(r0)
            L15:
                return r3
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: b */
        public void mo7920b(p290qb.C5614c r1, java.lang.Number r2) {
                r0 = this;
                java.lang.Number r2 = (java.lang.Number) r2
                r1.mo10422i0(r2)
                return
        }
    }

    /* renamed from: mb.o$d0 */
    public class d0 extends p169jb.AbstractC3483z<java.util.concurrent.atomic.AtomicBoolean> {
        public d0() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: a */
        public java.util.concurrent.atomic.AtomicBoolean mo7919a(p290qb.C5612a r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
                boolean r2 = r2.mo10404V()
                r0.<init>(r2)
                return r0
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: b */
        public void mo7920b(p290qb.C5614c r1, java.util.concurrent.atomic.AtomicBoolean r2) {
                r0 = this;
                java.util.concurrent.atomic.AtomicBoolean r2 = (java.util.concurrent.atomic.AtomicBoolean) r2
                boolean r2 = r2.get()
                r1.mo10425s0(r2)
                return
        }
    }

    /* renamed from: mb.o$e */
    public class e extends p169jb.AbstractC3483z<java.lang.Number> {
        public e() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: a */
        public java.lang.Number mo7919a(p290qb.C5612a r4) {
                r3 = this;
                qb.b r0 = r4.mo10414z0()
                int r1 = r0.ordinal()
                r2 = 5
                if (r1 == r2) goto L2e
                r2 = 6
                if (r1 == r2) goto L2e
                r2 = 8
                if (r1 != r2) goto L17
                r4.mo10411m0()
                r4 = 0
                goto L38
            L17:
                jb.w r4 = new jb.w
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Expecting number, got: "
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r4.<init>(r0)
                throw r4
            L2e:
                lb.q r0 = new lb.q
                java.lang.String r4 = r4.mo10413x0()
                r0.<init>(r4)
                r4 = r0
            L38:
                return r4
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: b */
        public void mo7920b(p290qb.C5614c r1, java.lang.Number r2) {
                r0 = this;
                java.lang.Number r2 = (java.lang.Number) r2
                r1.mo10422i0(r2)
                return
        }
    }

    /* renamed from: mb.o$e0 */
    public static final class e0<T extends java.lang.Enum<T>> extends p169jb.AbstractC3483z<T> {

        /* renamed from: a */
        public final java.util.Map<java.lang.String, T> f18402a;

        /* renamed from: b */
        public final java.util.Map<T, java.lang.String> f18403b;

        public e0(java.lang.Class<T> r12) {
                r11 = this;
                r11.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r11.f18402a = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r11.f18403b = r0
                java.lang.Object[] r0 = r12.getEnumConstants()     // Catch: java.lang.NoSuchFieldException -> L54
                java.lang.Enum[] r0 = (java.lang.Enum[]) r0     // Catch: java.lang.NoSuchFieldException -> L54
                int r1 = r0.length     // Catch: java.lang.NoSuchFieldException -> L54
                r2 = 0
                r3 = 0
            L1a:
                if (r3 >= r1) goto L53
                r4 = r0[r3]     // Catch: java.lang.NoSuchFieldException -> L54
                java.lang.String r5 = r4.name()     // Catch: java.lang.NoSuchFieldException -> L54
                java.lang.reflect.Field r6 = r12.getField(r5)     // Catch: java.lang.NoSuchFieldException -> L54
                java.lang.Class<kb.b> r7 = p189kb.InterfaceC4079b.class
                java.lang.annotation.Annotation r6 = r6.getAnnotation(r7)     // Catch: java.lang.NoSuchFieldException -> L54
                kb.b r6 = (p189kb.InterfaceC4079b) r6     // Catch: java.lang.NoSuchFieldException -> L54
                if (r6 == 0) goto L46
                java.lang.String r5 = r6.value()     // Catch: java.lang.NoSuchFieldException -> L54
                java.lang.String[] r6 = r6.alternate()     // Catch: java.lang.NoSuchFieldException -> L54
                int r7 = r6.length     // Catch: java.lang.NoSuchFieldException -> L54
                r8 = 0
            L3a:
                if (r8 >= r7) goto L46
                r9 = r6[r8]     // Catch: java.lang.NoSuchFieldException -> L54
                java.util.Map<java.lang.String, T extends java.lang.Enum<T>> r10 = r11.f18402a     // Catch: java.lang.NoSuchFieldException -> L54
                r10.put(r9, r4)     // Catch: java.lang.NoSuchFieldException -> L54
                int r8 = r8 + 1
                goto L3a
            L46:
                java.util.Map<java.lang.String, T extends java.lang.Enum<T>> r6 = r11.f18402a     // Catch: java.lang.NoSuchFieldException -> L54
                r6.put(r5, r4)     // Catch: java.lang.NoSuchFieldException -> L54
                java.util.Map<T extends java.lang.Enum<T>, java.lang.String> r6 = r11.f18403b     // Catch: java.lang.NoSuchFieldException -> L54
                r6.put(r4, r5)     // Catch: java.lang.NoSuchFieldException -> L54
                int r3 = r3 + 1
                goto L1a
            L53:
                return
            L54:
                r12 = move-exception
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>(r12)
                throw r0
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: a */
        public java.lang.Object mo7919a(p290qb.C5612a r3) {
                r2 = this;
                qb.b r0 = r3.mo10414z0()
                qb.b r1 = p290qb.EnumC5613b.f21798g0
                if (r0 != r1) goto Ld
                r3.mo10411m0()
                r3 = 0
                goto L19
            Ld:
                java.util.Map<java.lang.String, T extends java.lang.Enum<T>> r0 = r2.f18402a
                java.lang.String r3 = r3.mo10413x0()
                java.lang.Object r3 = r0.get(r3)
                java.lang.Enum r3 = (java.lang.Enum) r3
            L19:
                return r3
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: b */
        public void mo7920b(p290qb.C5614c r2, java.lang.Object r3) {
                r1 = this;
                java.lang.Enum r3 = (java.lang.Enum) r3
                if (r3 != 0) goto L6
                r3 = 0
                goto Le
            L6:
                java.util.Map<T extends java.lang.Enum<T>, java.lang.String> r0 = r1.f18403b
                java.lang.Object r3 = r0.get(r3)
                java.lang.String r3 = (java.lang.String) r3
            Le:
                r2.mo10423m0(r3)
                return
        }
    }

    /* renamed from: mb.o$f */
    public class f extends p169jb.AbstractC3483z<java.lang.Character> {
        public f() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: a */
        public java.lang.Character mo7919a(p290qb.C5612a r3) {
                r2 = this;
                qb.b r0 = r3.mo10414z0()
                qb.b r1 = p290qb.EnumC5613b.f21798g0
                if (r0 != r1) goto Ld
                r3.mo10411m0()
                r3 = 0
                goto L21
            Ld:
                java.lang.String r3 = r3.mo10413x0()
                int r0 = r3.length()
                r1 = 1
                if (r0 != r1) goto L22
                r0 = 0
                char r3 = r3.charAt(r0)
                java.lang.Character r3 = java.lang.Character.valueOf(r3)
            L21:
                return r3
            L22:
                jb.w r0 = new jb.w
                java.lang.String r1 = "Expecting character, got: "
                java.lang.String r3 = p064e.C1493g.m4049a(r1, r3)
                r0.<init>(r3)
                throw r0
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: b */
        public void mo7920b(p290qb.C5614c r1, java.lang.Character r2) {
                r0 = this;
                java.lang.Character r2 = (java.lang.Character) r2
                if (r2 != 0) goto L6
                r2 = 0
                goto La
            L6:
                java.lang.String r2 = java.lang.String.valueOf(r2)
            La:
                r1.mo10423m0(r2)
                return
        }
    }

    /* renamed from: mb.o$g */
    public class g extends p169jb.AbstractC3483z<java.lang.String> {
        public g() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: a */
        public java.lang.String mo7919a(p290qb.C5612a r3) {
                r2 = this;
                qb.b r0 = r3.mo10414z0()
                qb.b r1 = p290qb.EnumC5613b.f21798g0
                if (r0 != r1) goto Ld
                r3.mo10411m0()
                r3 = 0
                goto L1e
            Ld:
                qb.b r1 = p290qb.EnumC5613b.f21797f0
                if (r0 != r1) goto L1a
                boolean r3 = r3.mo10404V()
                java.lang.String r3 = java.lang.Boolean.toString(r3)
                goto L1e
            L1a:
                java.lang.String r3 = r3.mo10413x0()
            L1e:
                return r3
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: b */
        public void mo7920b(p290qb.C5614c r1, java.lang.String r2) {
                r0 = this;
                java.lang.String r2 = (java.lang.String) r2
                r1.mo10423m0(r2)
                return
        }
    }

    /* renamed from: mb.o$h */
    public class h extends p169jb.AbstractC3483z<java.math.BigDecimal> {
        public h() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: a */
        public java.math.BigDecimal mo7919a(p290qb.C5612a r3) {
                r2 = this;
                qb.b r0 = r3.mo10414z0()
                qb.b r1 = p290qb.EnumC5613b.f21798g0
                if (r0 != r1) goto Ld
                r3.mo10411m0()
                r3 = 0
                goto L17
            Ld:
                java.math.BigDecimal r0 = new java.math.BigDecimal     // Catch: java.lang.NumberFormatException -> L18
                java.lang.String r3 = r3.mo10413x0()     // Catch: java.lang.NumberFormatException -> L18
                r0.<init>(r3)     // Catch: java.lang.NumberFormatException -> L18
                r3 = r0
            L17:
                return r3
            L18:
                r3 = move-exception
                jb.w r0 = new jb.w
                r0.<init>(r3)
                throw r0
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: b */
        public void mo7920b(p290qb.C5614c r1, java.math.BigDecimal r2) {
                r0 = this;
                java.math.BigDecimal r2 = (java.math.BigDecimal) r2
                r1.mo10422i0(r2)
                return
        }
    }

    /* renamed from: mb.o$i */
    public class i extends p169jb.AbstractC3483z<java.math.BigInteger> {
        public i() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: a */
        public java.math.BigInteger mo7919a(p290qb.C5612a r3) {
                r2 = this;
                qb.b r0 = r3.mo10414z0()
                qb.b r1 = p290qb.EnumC5613b.f21798g0
                if (r0 != r1) goto Ld
                r3.mo10411m0()
                r3 = 0
                goto L17
            Ld:
                java.math.BigInteger r0 = new java.math.BigInteger     // Catch: java.lang.NumberFormatException -> L18
                java.lang.String r3 = r3.mo10413x0()     // Catch: java.lang.NumberFormatException -> L18
                r0.<init>(r3)     // Catch: java.lang.NumberFormatException -> L18
                r3 = r0
            L17:
                return r3
            L18:
                r3 = move-exception
                jb.w r0 = new jb.w
                r0.<init>(r3)
                throw r0
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: b */
        public void mo7920b(p290qb.C5614c r1, java.math.BigInteger r2) {
                r0 = this;
                java.math.BigInteger r2 = (java.math.BigInteger) r2
                r1.mo10422i0(r2)
                return
        }
    }

    /* renamed from: mb.o$j */
    public class j extends p169jb.AbstractC3483z<java.lang.StringBuilder> {
        public j() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: a */
        public java.lang.StringBuilder mo7919a(p290qb.C5612a r3) {
                r2 = this;
                qb.b r0 = r3.mo10414z0()
                qb.b r1 = p290qb.EnumC5613b.f21798g0
                if (r0 != r1) goto Ld
                r3.mo10411m0()
                r3 = 0
                goto L17
            Ld:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r3 = r3.mo10413x0()
                r0.<init>(r3)
                r3 = r0
            L17:
                return r3
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: b */
        public void mo7920b(p290qb.C5614c r1, java.lang.StringBuilder r2) {
                r0 = this;
                java.lang.StringBuilder r2 = (java.lang.StringBuilder) r2
                if (r2 != 0) goto L6
                r2 = 0
                goto La
            L6:
                java.lang.String r2 = r2.toString()
            La:
                r1.mo10423m0(r2)
                return
        }
    }

    /* renamed from: mb.o$k */
    public class k extends p169jb.AbstractC3483z<java.lang.Class> {
        public k() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: a */
        public java.lang.Class mo7919a(p290qb.C5612a r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?"
                r2.<init>(r0)
                throw r2
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: b */
        public void mo7920b(p290qb.C5614c r2, java.lang.Class r3) {
                r1 = this;
                java.lang.Class r3 = (java.lang.Class) r3
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Attempted to serialize java.lang.Class: "
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.lang.String r3 = r3.getName()
                r0.append(r3)
                java.lang.String r3 = ". Forgot to register a type adapter?"
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                throw r2
        }
    }

    /* renamed from: mb.o$l */
    public class l extends p169jb.AbstractC3483z<java.lang.StringBuffer> {
        public l() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: a */
        public java.lang.StringBuffer mo7919a(p290qb.C5612a r3) {
                r2 = this;
                qb.b r0 = r3.mo10414z0()
                qb.b r1 = p290qb.EnumC5613b.f21798g0
                if (r0 != r1) goto Ld
                r3.mo10411m0()
                r3 = 0
                goto L17
            Ld:
                java.lang.StringBuffer r0 = new java.lang.StringBuffer
                java.lang.String r3 = r3.mo10413x0()
                r0.<init>(r3)
                r3 = r0
            L17:
                return r3
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: b */
        public void mo7920b(p290qb.C5614c r1, java.lang.StringBuffer r2) {
                r0 = this;
                java.lang.StringBuffer r2 = (java.lang.StringBuffer) r2
                if (r2 != 0) goto L6
                r2 = 0
                goto La
            L6:
                java.lang.String r2 = r2.toString()
            La:
                r1.mo10423m0(r2)
                return
        }
    }

    /* renamed from: mb.o$m */
    public class m extends p169jb.AbstractC3483z<java.net.URL> {
        public m() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: a */
        public java.net.URL mo7919a(p290qb.C5612a r4) {
                r3 = this;
                qb.b r0 = r4.mo10414z0()
                qb.b r1 = p290qb.EnumC5613b.f21798g0
                r2 = 0
                if (r0 != r1) goto Ld
                r4.mo10411m0()
                goto L1f
            Ld:
                java.lang.String r4 = r4.mo10413x0()
                java.lang.String r0 = "null"
                boolean r0 = r0.equals(r4)
                if (r0 == 0) goto L1a
                goto L1f
            L1a:
                java.net.URL r2 = new java.net.URL
                r2.<init>(r4)
            L1f:
                return r2
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: b */
        public void mo7920b(p290qb.C5614c r1, java.net.URL r2) {
                r0 = this;
                java.net.URL r2 = (java.net.URL) r2
                if (r2 != 0) goto L6
                r2 = 0
                goto La
            L6:
                java.lang.String r2 = r2.toExternalForm()
            La:
                r1.mo10423m0(r2)
                return
        }
    }

    /* renamed from: mb.o$n */
    public class n extends p169jb.AbstractC3483z<java.net.URI> {
        public n() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: a */
        public java.net.URI mo7919a(p290qb.C5612a r4) {
                r3 = this;
                qb.b r0 = r4.mo10414z0()
                qb.b r1 = p290qb.EnumC5613b.f21798g0
                r2 = 0
                if (r0 != r1) goto Ld
                r4.mo10411m0()
                goto L1f
            Ld:
                java.lang.String r4 = r4.mo10413x0()     // Catch: java.net.URISyntaxException -> L20
                java.lang.String r0 = "null"
                boolean r0 = r0.equals(r4)     // Catch: java.net.URISyntaxException -> L20
                if (r0 == 0) goto L1a
                goto L1f
            L1a:
                java.net.URI r2 = new java.net.URI     // Catch: java.net.URISyntaxException -> L20
                r2.<init>(r4)     // Catch: java.net.URISyntaxException -> L20
            L1f:
                return r2
            L20:
                r4 = move-exception
                jb.q r0 = new jb.q
                r0.<init>(r4)
                throw r0
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: b */
        public void mo7920b(p290qb.C5614c r1, java.net.URI r2) {
                r0 = this;
                java.net.URI r2 = (java.net.URI) r2
                if (r2 != 0) goto L6
                r2 = 0
                goto La
            L6:
                java.lang.String r2 = r2.toASCIIString()
            La:
                r1.mo10423m0(r2)
                return
        }
    }

    /* renamed from: mb.o$o */
    public class o extends p169jb.AbstractC3483z<java.net.InetAddress> {
        public o() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: a */
        public java.net.InetAddress mo7919a(p290qb.C5612a r3) {
                r2 = this;
                qb.b r0 = r3.mo10414z0()
                qb.b r1 = p290qb.EnumC5613b.f21798g0
                if (r0 != r1) goto Ld
                r3.mo10411m0()
                r3 = 0
                goto L15
            Ld:
                java.lang.String r3 = r3.mo10413x0()
                java.net.InetAddress r3 = java.net.InetAddress.getByName(r3)
            L15:
                return r3
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: b */
        public void mo7920b(p290qb.C5614c r1, java.net.InetAddress r2) {
                r0 = this;
                java.net.InetAddress r2 = (java.net.InetAddress) r2
                if (r2 != 0) goto L6
                r2 = 0
                goto La
            L6:
                java.lang.String r2 = r2.getHostAddress()
            La:
                r1.mo10423m0(r2)
                return
        }
    }

    /* renamed from: mb.o$p */
    public class p extends p169jb.AbstractC3483z<java.util.UUID> {
        public p() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: a */
        public java.util.UUID mo7919a(p290qb.C5612a r3) {
                r2 = this;
                qb.b r0 = r3.mo10414z0()
                qb.b r1 = p290qb.EnumC5613b.f21798g0
                if (r0 != r1) goto Ld
                r3.mo10411m0()
                r3 = 0
                goto L15
            Ld:
                java.lang.String r3 = r3.mo10413x0()
                java.util.UUID r3 = java.util.UUID.fromString(r3)
            L15:
                return r3
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: b */
        public void mo7920b(p290qb.C5614c r1, java.util.UUID r2) {
                r0 = this;
                java.util.UUID r2 = (java.util.UUID) r2
                if (r2 != 0) goto L6
                r2 = 0
                goto La
            L6:
                java.lang.String r2 = r2.toString()
            La:
                r1.mo10423m0(r2)
                return
        }
    }

    /* renamed from: mb.o$q */
    public class q extends p169jb.AbstractC3483z<java.util.Currency> {
        public q() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: a */
        public java.util.Currency mo7919a(p290qb.C5612a r1) {
                r0 = this;
                java.lang.String r1 = r1.mo10413x0()
                java.util.Currency r1 = java.util.Currency.getInstance(r1)
                return r1
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: b */
        public void mo7920b(p290qb.C5614c r1, java.util.Currency r2) {
                r0 = this;
                java.util.Currency r2 = (java.util.Currency) r2
                java.lang.String r2 = r2.getCurrencyCode()
                r1.mo10423m0(r2)
                return
        }
    }

    /* renamed from: mb.o$r */
    public class r implements p169jb.InterfaceC3458a0 {

        /* renamed from: mb.o$r$a */
        public class a extends p169jb.AbstractC3483z<java.sql.Timestamp> {

            /* renamed from: a */
            public final /* synthetic */ p169jb.AbstractC3483z f18404a;

            public a(p222mb.C4524o.r r1, p169jb.AbstractC3483z r2) {
                    r0 = this;
                    r0.f18404a = r2
                    r0.<init>()
                    return
            }

            @Override // p169jb.AbstractC3483z
            /* renamed from: a */
            public java.sql.Timestamp mo7919a(p290qb.C5612a r4) {
                    r3 = this;
                    jb.z r0 = r3.f18404a
                    java.lang.Object r4 = r0.mo7919a(r4)
                    java.util.Date r4 = (java.util.Date) r4
                    if (r4 == 0) goto L14
                    java.sql.Timestamp r0 = new java.sql.Timestamp
                    long r1 = r4.getTime()
                    r0.<init>(r1)
                    goto L15
                L14:
                    r0 = 0
                L15:
                    return r0
            }

            @Override // p169jb.AbstractC3483z
            /* renamed from: b */
            public void mo7920b(p290qb.C5614c r2, java.sql.Timestamp r3) {
                    r1 = this;
                    java.sql.Timestamp r3 = (java.sql.Timestamp) r3
                    jb.z r0 = r1.f18404a
                    r0.mo7920b(r2, r3)
                    return
            }
        }

        public r() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p169jb.InterfaceC3458a0
        /* renamed from: a */
        public <T> p169jb.AbstractC3483z<T> mo7921a(p169jb.C3467j r2, p274pb.C5380a<T> r3) {
                r1 = this;
                java.lang.Class<? super T> r3 = r3.f21381a
                java.lang.Class<java.sql.Timestamp> r0 = java.sql.Timestamp.class
                if (r3 == r0) goto L8
                r2 = 0
                return r2
            L8:
                java.lang.Class<java.util.Date> r3 = java.util.Date.class
                java.util.Objects.requireNonNull(r2)
                pb.a r0 = new pb.a
                r0.<init>(r3)
                jb.z r2 = r2.m7931e(r0)
                mb.o$r$a r3 = new mb.o$r$a
                r3.<init>(r1, r2)
                return r3
        }
    }

    /* renamed from: mb.o$s */
    public class s extends p169jb.AbstractC3483z<java.util.Calendar> {
        public s() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: a */
        public java.util.Calendar mo7919a(p290qb.C5612a r10) {
                r9 = this;
                qb.b r0 = r10.mo10414z0()
                qb.b r1 = p290qb.EnumC5613b.f21798g0
                if (r0 != r1) goto Le
                r10.mo10411m0()
                r10 = 0
                goto L6d
            Le:
                r10.mo10410h()
                r0 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
            L18:
                qb.b r0 = r10.mo10414z0()
                qb.b r1 = p290qb.EnumC5613b.f21793b0
                if (r0 == r1) goto L64
                java.lang.String r0 = r10.mo10409f0()
                int r1 = r10.mo10407b0()
                java.lang.String r8 = "year"
                boolean r8 = r8.equals(r0)
                if (r8 == 0) goto L32
                r2 = r1
                goto L18
            L32:
                java.lang.String r8 = "month"
                boolean r8 = r8.equals(r0)
                if (r8 == 0) goto L3c
                r3 = r1
                goto L18
            L3c:
                java.lang.String r8 = "dayOfMonth"
                boolean r8 = r8.equals(r0)
                if (r8 == 0) goto L46
                r4 = r1
                goto L18
            L46:
                java.lang.String r8 = "hourOfDay"
                boolean r8 = r8.equals(r0)
                if (r8 == 0) goto L50
                r5 = r1
                goto L18
            L50:
                java.lang.String r8 = "minute"
                boolean r8 = r8.equals(r0)
                if (r8 == 0) goto L5a
                r6 = r1
                goto L18
            L5a:
                java.lang.String r8 = "second"
                boolean r0 = r8.equals(r0)
                if (r0 == 0) goto L18
                r7 = r1
                goto L18
            L64:
                r10.mo10396A()
                java.util.GregorianCalendar r10 = new java.util.GregorianCalendar
                r1 = r10
                r1.<init>(r2, r3, r4, r5, r6, r7)
            L6d:
                return r10
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: b */
        public void mo7920b(p290qb.C5614c r3, java.util.Calendar r4) {
                r2 = this;
                java.util.Calendar r4 = (java.util.Calendar) r4
                if (r4 != 0) goto L8
                r3.mo10417R()
                goto L65
            L8:
                r3.mo10421i()
                java.lang.String r0 = "year"
                r3.mo10416L(r0)
                r0 = 1
                int r0 = r4.get(r0)
                long r0 = (long) r0
                r3.mo10418d0(r0)
                java.lang.String r0 = "month"
                r3.mo10416L(r0)
                r0 = 2
                int r0 = r4.get(r0)
                long r0 = (long) r0
                r3.mo10418d0(r0)
                java.lang.String r0 = "dayOfMonth"
                r3.mo10416L(r0)
                r0 = 5
                int r0 = r4.get(r0)
                long r0 = (long) r0
                r3.mo10418d0(r0)
                java.lang.String r0 = "hourOfDay"
                r3.mo10416L(r0)
                r0 = 11
                int r0 = r4.get(r0)
                long r0 = (long) r0
                r3.mo10418d0(r0)
                java.lang.String r0 = "minute"
                r3.mo10416L(r0)
                r0 = 12
                int r0 = r4.get(r0)
                long r0 = (long) r0
                r3.mo10418d0(r0)
                java.lang.String r0 = "second"
                r3.mo10416L(r0)
                r0 = 13
                int r4 = r4.get(r0)
                long r0 = (long) r4
                r3.mo10418d0(r0)
                r3.mo10415A()
            L65:
                return
        }
    }

    /* renamed from: mb.o$t */
    public class t extends p169jb.AbstractC3483z<java.util.Locale> {
        public t() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: a */
        public java.util.Locale mo7919a(p290qb.C5612a r5) {
                r4 = this;
                qb.b r0 = r5.mo10414z0()
                qb.b r1 = p290qb.EnumC5613b.f21798g0
                r2 = 0
                if (r0 != r1) goto Ld
                r5.mo10411m0()
                goto L50
            Ld:
                java.lang.String r5 = r5.mo10413x0()
                java.util.StringTokenizer r0 = new java.util.StringTokenizer
                java.lang.String r1 = "_"
                r0.<init>(r5, r1)
                boolean r5 = r0.hasMoreElements()
                if (r5 == 0) goto L23
                java.lang.String r5 = r0.nextToken()
                goto L24
            L23:
                r5 = r2
            L24:
                boolean r1 = r0.hasMoreElements()
                if (r1 == 0) goto L2f
                java.lang.String r1 = r0.nextToken()
                goto L30
            L2f:
                r1 = r2
            L30:
                boolean r3 = r0.hasMoreElements()
                if (r3 == 0) goto L3a
                java.lang.String r2 = r0.nextToken()
            L3a:
                if (r1 != 0) goto L44
                if (r2 != 0) goto L44
                java.util.Locale r2 = new java.util.Locale
                r2.<init>(r5)
                goto L50
            L44:
                java.util.Locale r0 = new java.util.Locale
                if (r2 != 0) goto L4c
                r0.<init>(r5, r1)
                goto L4f
            L4c:
                r0.<init>(r5, r1, r2)
            L4f:
                r2 = r0
            L50:
                return r2
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: b */
        public void mo7920b(p290qb.C5614c r1, java.util.Locale r2) {
                r0 = this;
                java.util.Locale r2 = (java.util.Locale) r2
                if (r2 != 0) goto L6
                r2 = 0
                goto La
            L6:
                java.lang.String r2 = r2.toString()
            La:
                r1.mo10423m0(r2)
                return
        }
    }

    /* renamed from: mb.o$u */
    public class u extends p169jb.AbstractC3483z<p169jb.AbstractC3473p> {
        public u() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: a */
        public /* bridge */ /* synthetic */ p169jb.AbstractC3473p mo7919a(p290qb.C5612a r1) {
                r0 = this;
                jb.p r1 = r0.m10432c(r1)
                return r1
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: b */
        public /* bridge */ /* synthetic */ void mo7920b(p290qb.C5614c r1, p169jb.AbstractC3473p r2) {
                r0 = this;
                jb.p r2 = (p169jb.AbstractC3473p) r2
                r0.m10433d(r1, r2)
                return
        }

        /* renamed from: c */
        public p169jb.AbstractC3473p m10432c(p290qb.C5612a r5) {
                r4 = this;
                qb.b r0 = r5.mo10414z0()
                int r0 = r0.ordinal()
                if (r0 == 0) goto L6d
                r1 = 2
                if (r0 == r1) goto L4d
                r1 = 5
                if (r0 == r1) goto L43
                r1 = 6
                if (r0 == r1) goto L34
                r1 = 7
                if (r0 == r1) goto L26
                r1 = 8
                if (r0 != r1) goto L20
                r5.mo10411m0()
                jb.r r5 = p169jb.C3475r.f14967a
                return r5
            L20:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                r5.<init>()
                throw r5
            L26:
                jb.t r0 = new jb.t
                boolean r5 = r5.mo10404V()
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                r0.<init>(r5)
                return r0
            L34:
                java.lang.String r5 = r5.mo10413x0()
                jb.t r0 = new jb.t
                lb.q r1 = new lb.q
                r1.<init>(r5)
                r0.<init>(r1)
                return r0
            L43:
                jb.t r0 = new jb.t
                java.lang.String r5 = r5.mo10413x0()
                r0.<init>(r5)
                return r0
            L4d:
                jb.s r0 = new jb.s
                r0.<init>()
                r5.mo10410h()
            L55:
                boolean r1 = r5.mo10403Q()
                if (r1 == 0) goto L69
                java.lang.String r1 = r5.mo10409f0()
                jb.p r2 = r4.m10432c(r5)
                lb.r<java.lang.String, jb.p> r3 = r0.f14968a
                r3.put(r1, r2)
                goto L55
            L69:
                r5.mo10396A()
                return r0
            L6d:
                jb.m r0 = new jb.m
                r0.<init>()
                r5.mo10406a()
            L75:
                boolean r1 = r5.mo10403Q()
                if (r1 == 0) goto L85
                jb.p r1 = r4.m10432c(r5)
                java.util.List<jb.p> r2 = r0.f14966Y
                r2.add(r1)
                goto L75
            L85:
                r5.mo10412n()
                return r0
        }

        /* renamed from: d */
        public void m10433d(p290qb.C5614c r5, p169jb.AbstractC3473p r6) {
                r4 = this;
                if (r6 == 0) goto Lea
                boolean r0 = r6 instanceof p169jb.C3475r
                if (r0 == 0) goto L8
                goto Lea
            L8:
                boolean r0 = r6 instanceof p169jb.C3477t
                if (r0 == 0) goto L35
                jb.t r6 = r6.m7947e()
                java.lang.Object r0 = r6.f14969a
                boolean r1 = r0 instanceof java.lang.Number
                if (r1 == 0) goto L1f
                java.lang.Number r6 = r6.m7953n()
                r5.mo10422i0(r6)
                goto Led
            L1f:
                boolean r0 = r0 instanceof java.lang.Boolean
                if (r0 == 0) goto L2c
                boolean r6 = r6.m7952m()
                r5.mo10425s0(r6)
                goto Led
            L2c:
                java.lang.String r6 = r6.mo7944l()
                r5.mo10423m0(r6)
                goto Led
            L35:
                boolean r0 = r6 instanceof p169jb.C3470m
                if (r0 == 0) goto L70
                r5.mo10420h()
                if (r0 == 0) goto L59
                jb.m r6 = (p169jb.C3470m) r6
                java.util.Iterator r6 = r6.iterator()
            L44:
                boolean r0 = r6.hasNext()
                if (r0 == 0) goto L54
                java.lang.Object r0 = r6.next()
                jb.p r0 = (p169jb.AbstractC3473p) r0
                r4.m10433d(r5, r0)
                goto L44
            L54:
                r5.mo10424n()
                goto Led
            L59:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Not a JSON Array: "
                r0.append(r1)
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                r5.<init>(r6)
                throw r5
            L70:
                boolean r0 = r6 instanceof p169jb.C3476s
                if (r0 == 0) goto Ld3
                r5.mo10421i()
                if (r0 == 0) goto Lbc
                jb.s r6 = (p169jb.C3476s) r6
                lb.r<java.lang.String, jb.p> r6 = r6.f14968a
                java.util.Set r6 = r6.entrySet()
                lb.r$b r6 = (lb.C4255r.b) r6
                lb.r r6 = r6.f17444Y
                lb.r$e<K, V> r0 = r6.f17441c0
                lb.r$e<K, V> r0 = r0.f17453b0
                int r1 = r6.f17440b0
            L8b:
                lb.r$e<K, V> r2 = r6.f17441c0
                if (r0 == r2) goto L91
                r3 = 1
                goto L92
            L91:
                r3 = 0
            L92:
                if (r3 == 0) goto Lb8
                if (r0 == r2) goto Lb2
                int r2 = r6.f17440b0
                if (r2 != r1) goto Lac
                lb.r$e<K, V> r2 = r0.f17453b0
                K r3 = r0.f17455d0
                java.lang.String r3 = (java.lang.String) r3
                r5.mo10416L(r3)
                V r0 = r0.f17456e0
                jb.p r0 = (p169jb.AbstractC3473p) r0
                r4.m10433d(r5, r0)
                r0 = r2
                goto L8b
            Lac:
                java.util.ConcurrentModificationException r5 = new java.util.ConcurrentModificationException
                r5.<init>()
                throw r5
            Lb2:
                java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
                r5.<init>()
                throw r5
            Lb8:
                r5.mo10415A()
                goto Led
            Lbc:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Not a JSON Object: "
                r0.append(r1)
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                r5.<init>(r6)
                throw r5
            Ld3:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Couldn't write "
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.lang.Class r6 = r6.getClass()
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                r5.<init>(r6)
                throw r5
            Lea:
                r5.mo10417R()
            Led:
                return
        }
    }

    /* renamed from: mb.o$v */
    public class v extends p169jb.AbstractC3483z<java.util.BitSet> {
        public v() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: a */
        public java.util.BitSet mo7919a(p290qb.C5612a r6) {
                r5 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r6.mo10406a()
                qb.b r1 = r6.mo10414z0()
                r2 = 0
            Ld:
                qb.b r3 = p290qb.EnumC5613b.f21791Z
                if (r1 == r3) goto L66
                int r3 = r1.ordinal()
                r4 = 5
                if (r3 == r4) goto L41
                r4 = 6
                if (r3 == r4) goto L3a
                r4 = 7
                if (r3 != r4) goto L23
                boolean r1 = r6.mo10404V()
                goto L4e
            L23:
                jb.w r6 = new jb.w
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Invalid bitset value type: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r6.<init>(r0)
                throw r6
            L3a:
                int r1 = r6.mo10407b0()
                if (r1 == 0) goto L4d
                goto L4b
            L41:
                java.lang.String r1 = r6.mo10413x0()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L5a
                if (r1 == 0) goto L4d
            L4b:
                r1 = 1
                goto L4e
            L4d:
                r1 = 0
            L4e:
                if (r1 == 0) goto L53
                r0.set(r2)
            L53:
                int r2 = r2 + 1
                qb.b r1 = r6.mo10414z0()
                goto Ld
            L5a:
                jb.w r6 = new jb.w
                java.lang.String r0 = "Error: Expecting: bitset number value (1, 0), Found: "
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
                r6.<init>(r0)
                throw r6
            L66:
                r6.mo10412n()
                return r0
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: b */
        public void mo7920b(p290qb.C5614c r5, java.util.BitSet r6) {
                r4 = this;
                java.util.BitSet r6 = (java.util.BitSet) r6
                r5.mo10420h()
                int r0 = r6.length()
                r1 = 0
            La:
                if (r1 >= r0) goto L17
                boolean r2 = r6.get(r1)
                long r2 = (long) r2
                r5.mo10418d0(r2)
                int r1 = r1 + 1
                goto La
            L17:
                r5.mo10424n()
                return
        }
    }

    /* renamed from: mb.o$w */
    public class w implements p169jb.InterfaceC3458a0 {
        public w() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p169jb.InterfaceC3458a0
        /* renamed from: a */
        public <T> p169jb.AbstractC3483z<T> mo7921a(p169jb.C3467j r2, p274pb.C5380a<T> r3) {
                r1 = this;
                java.lang.Class<java.lang.Enum> r2 = java.lang.Enum.class
                java.lang.Class<? super T> r3 = r3.f21381a
                boolean r0 = r2.isAssignableFrom(r3)
                if (r0 == 0) goto L1d
                if (r3 != r2) goto Ld
                goto L1d
            Ld:
                boolean r2 = r3.isEnum()
                if (r2 != 0) goto L17
                java.lang.Class r3 = r3.getSuperclass()
            L17:
                mb.o$e0 r2 = new mb.o$e0
                r2.<init>(r3)
                return r2
            L1d:
                r2 = 0
                return r2
        }
    }

    /* renamed from: mb.o$x */
    public class x extends p169jb.AbstractC3483z<java.lang.Boolean> {
        public x() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: a */
        public java.lang.Boolean mo7919a(p290qb.C5612a r3) {
                r2 = this;
                qb.b r0 = r3.mo10414z0()
                qb.b r1 = p290qb.EnumC5613b.f21798g0
                if (r0 != r1) goto Ld
                r3.mo10411m0()
                r3 = 0
                goto L22
            Ld:
                qb.b r1 = p290qb.EnumC5613b.f21795d0
                if (r0 != r1) goto L1a
                java.lang.String r3 = r3.mo10413x0()
                boolean r3 = java.lang.Boolean.parseBoolean(r3)
                goto L1e
            L1a:
                boolean r3 = r3.mo10404V()
            L1e:
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            L22:
                return r3
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: b */
        public void mo7920b(p290qb.C5614c r1, java.lang.Boolean r2) {
                r0 = this;
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                r1.mo10419f0(r2)
                return
        }
    }

    /* renamed from: mb.o$y */
    public class y extends p169jb.AbstractC3483z<java.lang.Boolean> {
        public y() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: a */
        public java.lang.Boolean mo7919a(p290qb.C5612a r3) {
                r2 = this;
                qb.b r0 = r3.mo10414z0()
                qb.b r1 = p290qb.EnumC5613b.f21798g0
                if (r0 != r1) goto Ld
                r3.mo10411m0()
                r3 = 0
                goto L15
            Ld:
                java.lang.String r3 = r3.mo10413x0()
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            L15:
                return r3
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: b */
        public void mo7920b(p290qb.C5614c r1, java.lang.Boolean r2) {
                r0 = this;
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                if (r2 != 0) goto L7
                java.lang.String r2 = "null"
                goto Lb
            L7:
                java.lang.String r2 = r2.toString()
            Lb:
                r1.mo10423m0(r2)
                return
        }
    }

    /* renamed from: mb.o$z */
    public class z extends p169jb.AbstractC3483z<java.lang.Number> {
        public z() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: a */
        public java.lang.Number mo7919a(p290qb.C5612a r3) {
                r2 = this;
                qb.b r0 = r3.mo10414z0()
                qb.b r1 = p290qb.EnumC5613b.f21798g0
                if (r0 != r1) goto Ld
                r3.mo10411m0()
                r3 = 0
                goto L16
            Ld:
                int r3 = r3.mo10407b0()     // Catch: java.lang.NumberFormatException -> L17
                byte r3 = (byte) r3     // Catch: java.lang.NumberFormatException -> L17
                java.lang.Byte r3 = java.lang.Byte.valueOf(r3)     // Catch: java.lang.NumberFormatException -> L17
            L16:
                return r3
            L17:
                r3 = move-exception
                jb.w r0 = new jb.w
                r0.<init>(r3)
                throw r0
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: b */
        public void mo7920b(p290qb.C5614c r1, java.lang.Number r2) {
                r0 = this;
                java.lang.Number r2 = (java.lang.Number) r2
                r1.mo10422i0(r2)
                return
        }
    }

    static {
            mb.o$k r0 = new mb.o$k
            r0.<init>()
            jb.y r1 = new jb.y
            r1.<init>(r0)
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            mb.p r2 = new mb.p
            r2.<init>(r0, r1)
            p222mb.C4524o.f18376a = r2
            mb.o$v r0 = new mb.o$v
            r0.<init>()
            jb.y r1 = new jb.y
            r1.<init>(r0)
            java.lang.Class<java.util.BitSet> r0 = java.util.BitSet.class
            mb.p r2 = new mb.p
            r2.<init>(r0, r1)
            p222mb.C4524o.f18377b = r2
            mb.o$x r0 = new mb.o$x
            r0.<init>()
            mb.o$y r1 = new mb.o$y
            r1.<init>()
            p222mb.C4524o.f18378c = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            mb.q r3 = new mb.q
            r3.<init>(r1, r2, r0)
            p222mb.C4524o.f18379d = r3
            mb.o$z r0 = new mb.o$z
            r0.<init>()
            java.lang.Class r1 = java.lang.Byte.TYPE
            java.lang.Class<java.lang.Byte> r2 = java.lang.Byte.class
            mb.q r3 = new mb.q
            r3.<init>(r1, r2, r0)
            p222mb.C4524o.f18380e = r3
            mb.o$a0 r0 = new mb.o$a0
            r0.<init>()
            java.lang.Class r1 = java.lang.Short.TYPE
            java.lang.Class<java.lang.Short> r2 = java.lang.Short.class
            mb.q r3 = new mb.q
            r3.<init>(r1, r2, r0)
            p222mb.C4524o.f18381f = r3
            mb.o$b0 r0 = new mb.o$b0
            r0.<init>()
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            mb.q r3 = new mb.q
            r3.<init>(r1, r2, r0)
            p222mb.C4524o.f18382g = r3
            mb.o$c0 r0 = new mb.o$c0
            r0.<init>()
            jb.y r1 = new jb.y
            r1.<init>(r0)
            java.lang.Class<java.util.concurrent.atomic.AtomicInteger> r0 = java.util.concurrent.atomic.AtomicInteger.class
            mb.p r2 = new mb.p
            r2.<init>(r0, r1)
            p222mb.C4524o.f18383h = r2
            mb.o$d0 r0 = new mb.o$d0
            r0.<init>()
            jb.y r1 = new jb.y
            r1.<init>(r0)
            java.lang.Class<java.util.concurrent.atomic.AtomicBoolean> r0 = java.util.concurrent.atomic.AtomicBoolean.class
            mb.p r2 = new mb.p
            r2.<init>(r0, r1)
            p222mb.C4524o.f18384i = r2
            mb.o$a r0 = new mb.o$a
            r0.<init>()
            jb.y r1 = new jb.y
            r1.<init>(r0)
            java.lang.Class<java.util.concurrent.atomic.AtomicIntegerArray> r0 = java.util.concurrent.atomic.AtomicIntegerArray.class
            mb.p r2 = new mb.p
            r2.<init>(r0, r1)
            p222mb.C4524o.f18385j = r2
            mb.o$b r0 = new mb.o$b
            r0.<init>()
            p222mb.C4524o.f18386k = r0
            mb.o$c r0 = new mb.o$c
            r0.<init>()
            p222mb.C4524o.f18387l = r0
            mb.o$d r0 = new mb.o$d
            r0.<init>()
            p222mb.C4524o.f18388m = r0
            mb.o$e r0 = new mb.o$e
            r0.<init>()
            java.lang.Class<java.lang.Number> r1 = java.lang.Number.class
            mb.p r2 = new mb.p
            r2.<init>(r1, r0)
            p222mb.C4524o.f18389n = r2
            mb.o$f r0 = new mb.o$f
            r0.<init>()
            java.lang.Class r1 = java.lang.Character.TYPE
            java.lang.Class<java.lang.Character> r2 = java.lang.Character.class
            mb.q r3 = new mb.q
            r3.<init>(r1, r2, r0)
            p222mb.C4524o.f18390o = r3
            mb.o$g r0 = new mb.o$g
            r0.<init>()
            mb.o$h r1 = new mb.o$h
            r1.<init>()
            p222mb.C4524o.f18391p = r1
            mb.o$i r1 = new mb.o$i
            r1.<init>()
            p222mb.C4524o.f18392q = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            mb.p r2 = new mb.p
            r2.<init>(r1, r0)
            p222mb.C4524o.f18393r = r2
            mb.o$j r0 = new mb.o$j
            r0.<init>()
            java.lang.Class<java.lang.StringBuilder> r1 = java.lang.StringBuilder.class
            mb.p r2 = new mb.p
            r2.<init>(r1, r0)
            p222mb.C4524o.f18394s = r2
            mb.o$l r0 = new mb.o$l
            r0.<init>()
            java.lang.Class<java.lang.StringBuffer> r1 = java.lang.StringBuffer.class
            mb.p r2 = new mb.p
            r2.<init>(r1, r0)
            p222mb.C4524o.f18395t = r2
            mb.o$m r0 = new mb.o$m
            r0.<init>()
            java.lang.Class<java.net.URL> r1 = java.net.URL.class
            mb.p r2 = new mb.p
            r2.<init>(r1, r0)
            p222mb.C4524o.f18396u = r2
            mb.o$n r0 = new mb.o$n
            r0.<init>()
            java.lang.Class<java.net.URI> r1 = java.net.URI.class
            mb.p r2 = new mb.p
            r2.<init>(r1, r0)
            p222mb.C4524o.f18397v = r2
            mb.o$o r0 = new mb.o$o
            r0.<init>()
            java.lang.Class<java.net.InetAddress> r1 = java.net.InetAddress.class
            mb.s r2 = new mb.s
            r2.<init>(r1, r0)
            p222mb.C4524o.f18398w = r2
            mb.o$p r0 = new mb.o$p
            r0.<init>()
            java.lang.Class<java.util.UUID> r1 = java.util.UUID.class
            mb.p r2 = new mb.p
            r2.<init>(r1, r0)
            p222mb.C4524o.f18399x = r2
            mb.o$q r0 = new mb.o$q
            r0.<init>()
            jb.y r1 = new jb.y
            r1.<init>(r0)
            java.lang.Class<java.util.Currency> r0 = java.util.Currency.class
            mb.p r2 = new mb.p
            r2.<init>(r0, r1)
            p222mb.C4524o.f18400y = r2
            mb.o$r r0 = new mb.o$r
            r0.<init>()
            p222mb.C4524o.f18401z = r0
            mb.o$s r0 = new mb.o$s
            r0.<init>()
            java.lang.Class<java.util.Calendar> r1 = java.util.Calendar.class
            java.lang.Class<java.util.GregorianCalendar> r2 = java.util.GregorianCalendar.class
            mb.r r3 = new mb.r
            r3.<init>(r1, r2, r0)
            p222mb.C4524o.f18371A = r3
            mb.o$t r0 = new mb.o$t
            r0.<init>()
            java.lang.Class<java.util.Locale> r1 = java.util.Locale.class
            mb.p r2 = new mb.p
            r2.<init>(r1, r0)
            p222mb.C4524o.f18372B = r2
            mb.o$u r0 = new mb.o$u
            r0.<init>()
            p222mb.C4524o.f18373C = r0
            java.lang.Class<jb.p> r1 = p169jb.AbstractC3473p.class
            mb.s r2 = new mb.s
            r2.<init>(r1, r0)
            p222mb.C4524o.f18374D = r2
            mb.o$w r0 = new mb.o$w
            r0.<init>()
            p222mb.C4524o.f18375E = r0
            return
    }
}
