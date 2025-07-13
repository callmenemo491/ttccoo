package p221m9;

import p221m9.AbstractC4501x;
import p221m9.AbstractC4501x.a;

/* renamed from: m9.x */
/* loaded from: classes.dex */
public abstract class AbstractC4501x<MessageType extends p221m9.AbstractC4501x<MessageType, BuilderType>, BuilderType extends p221m9.AbstractC4501x.a<MessageType, BuilderType>> extends p221m9.AbstractC4433a<MessageType, BuilderType> {
    private static java.util.Map<java.lang.Object, p221m9.AbstractC4501x<?, ?>> defaultInstanceMap;
    public int memoizedSerializedSize;
    public p221m9.C4474n1 unknownFields;

    /* renamed from: m9.x$a */
    public static abstract class a<MessageType extends p221m9.AbstractC4501x<MessageType, BuilderType>, BuilderType extends p221m9.AbstractC4501x.a<MessageType, BuilderType>> extends p221m9.AbstractC4433a.a<MessageType, BuilderType> {

        /* renamed from: Y */
        public final MessageType f18292Y;

        /* renamed from: Z */
        public MessageType f18293Z;

        /* renamed from: a0 */
        public boolean f18294a0;

        public a(MessageType r3) {
                r2 = this;
                r2.<init>()
                r2.f18292Y = r3
                m9.x$f r0 = p221m9.AbstractC4501x.f.f18299b0
                r1 = 0
                java.lang.Object r3 = r3.mo9340o(r0, r1, r1)
                m9.x r3 = (p221m9.AbstractC4501x) r3
                r2.f18293Z = r3
                r3 = 0
                r2.f18294a0 = r3
                return
        }

        @Override // p221m9.InterfaceC4485r0
        /* renamed from: b */
        public p221m9.InterfaceC4482q0 mo10279b() {
                r1 = this;
                MessageType extends m9.x<MessageType, BuilderType> r0 = r1.f18292Y
                return r0
        }

        public java.lang.Object clone() {
                r3 = this;
                MessageType extends m9.x<MessageType, BuilderType> r0 = r3.f18292Y
                m9.x$f r1 = p221m9.AbstractC4501x.f.f18300c0
                r2 = 0
                java.lang.Object r0 = r0.mo9340o(r1, r2, r2)
                m9.x$a r0 = (p221m9.AbstractC4501x.a) r0
                m9.x r1 = r3.m10376m()
                r0.m10378p(r1)
                return r0
        }

        /* renamed from: k */
        public final MessageType m10375k() {
                r2 = this;
                m9.x r0 = r2.m10376m()
                boolean r1 = r0.mo10280j()
                if (r1 == 0) goto Lb
                return r0
            Lb:
                m9.l1 r0 = new m9.l1
                r0.<init>()
                throw r0
        }

        /* renamed from: m */
        public MessageType m10376m() {
                r2 = this;
                boolean r0 = r2.f18294a0
                if (r0 == 0) goto L7
                MessageType extends m9.x<MessageType, BuilderType> r0 = r2.f18293Z
                return r0
            L7:
                MessageType extends m9.x<MessageType, BuilderType> r0 = r2.f18293Z
                java.util.Objects.requireNonNull(r0)
                m9.a1 r1 = p221m9.C4435a1.f18092c
                m9.e1 r1 = r1.m9904b(r0)
                r1.mo9989d(r0)
                r0 = 1
                r2.f18294a0 = r0
                MessageType extends m9.x<MessageType, BuilderType> r0 = r2.f18293Z
                return r0
        }

        /* renamed from: o */
        public final void m10377o() {
                r3 = this;
                boolean r0 = r3.f18294a0
                if (r0 == 0) goto L1f
                MessageType extends m9.x<MessageType, BuilderType> r0 = r3.f18293Z
                m9.x$f r1 = p221m9.AbstractC4501x.f.f18299b0
                r2 = 0
                java.lang.Object r0 = r0.mo9340o(r1, r2, r2)
                m9.x r0 = (p221m9.AbstractC4501x) r0
                MessageType extends m9.x<MessageType, BuilderType> r1 = r3.f18293Z
                m9.a1 r2 = p221m9.C4435a1.f18092c
                m9.e1 r2 = r2.m9904b(r0)
                r2.mo9986a(r0, r1)
                r3.f18293Z = r0
                r0 = 0
                r3.f18294a0 = r0
            L1f:
                return
        }

        /* renamed from: p */
        public BuilderType m10378p(MessageType r2) {
                r1 = this;
                r1.m10377o()
                MessageType extends m9.x<MessageType, BuilderType> r0 = r1.f18293Z
                r1.m10379q(r0, r2)
                return r1
        }

        /* renamed from: q */
        public final void m10379q(MessageType r2, MessageType r3) {
                r1 = this;
                m9.a1 r0 = p221m9.C4435a1.f18092c
                m9.e1 r0 = r0.m9904b(r2)
                r0.mo9986a(r2, r3)
                return
        }
    }

    /* renamed from: m9.x$b */
    public static class b<T extends p221m9.AbstractC4501x<T, ?>> extends p221m9.AbstractC4436b<T> {

        /* renamed from: a */
        public final T f18295a;

        public b(T r1) {
                r0 = this;
                r0.<init>()
                r0.f18295a = r1
                return
        }
    }

    /* renamed from: m9.x$c */
    public static abstract class c<MessageType extends p221m9.AbstractC4501x.c<MessageType, BuilderType>, BuilderType> extends p221m9.AbstractC4501x<MessageType, BuilderType> implements p221m9.InterfaceC4485r0 {
        public p221m9.C4490t<p221m9.AbstractC4501x.d> extensions;

        public c() {
                r1 = this;
                r1.<init>()
                m9.t r0 = p221m9.C4490t.f18224d
                r1.extensions = r0
                return
        }

        /* renamed from: w */
        public p221m9.C4490t<p221m9.AbstractC4501x.d> m10380w() {
                r2 = this;
                m9.t<m9.x$d> r0 = r2.extensions
                boolean r1 = r0.f18226b
                if (r1 == 0) goto Lc
                m9.t r0 = r0.m10303a()
                r2.extensions = r0
            Lc:
                m9.t<m9.x$d> r0 = r2.extensions
                return r0
        }
    }

    /* renamed from: m9.x$d */
    public static final class d implements p221m9.C4490t.a<p221m9.AbstractC4501x.d> {
        @Override // java.lang.Comparable
        public int compareTo(java.lang.Object r1) {
                r0 = this;
                m9.x$d r1 = (p221m9.AbstractC4501x.d) r1
                java.util.Objects.requireNonNull(r1)
                r1 = 0
                return r1
        }

        @Override // p221m9.C4490t.a
        /* renamed from: d */
        public int mo10313d() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // p221m9.C4490t.a
        /* renamed from: f */
        public boolean mo10314f() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // p221m9.C4490t.a
        /* renamed from: i */
        public p221m9.EnumC4492t1 mo10315i() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // p221m9.C4490t.a
        /* renamed from: j */
        public p221m9.InterfaceC4482q0.a mo10316j(p221m9.InterfaceC4482q0.a r1, p221m9.InterfaceC4482q0 r2) {
                r0 = this;
                m9.x$a r1 = (p221m9.AbstractC4501x.a) r1
                m9.x r2 = (p221m9.AbstractC4501x) r2
                r1.m10378p(r2)
                return r1
        }

        @Override // p221m9.C4490t.a
        /* renamed from: m */
        public p221m9.EnumC4495u1 mo10317m() {
                r1 = this;
                r0 = 0
                throw r0
        }

        @Override // p221m9.C4490t.a
        /* renamed from: n */
        public boolean mo10318n() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    /* renamed from: m9.x$e */
    public static class e<ContainingType extends p221m9.InterfaceC4482q0, Type> extends p221m9.AbstractC4472n<ContainingType, Type> {
    }

    /* renamed from: m9.x$f */
    public enum f extends java.lang.Enum<p221m9.AbstractC4501x.f> {

        /* renamed from: Y */
        public static final p221m9.AbstractC4501x.f f18296Y = null;

        /* renamed from: Z */
        public static final p221m9.AbstractC4501x.f f18297Z = null;

        /* renamed from: a0 */
        public static final p221m9.AbstractC4501x.f f18298a0 = null;

        /* renamed from: b0 */
        public static final p221m9.AbstractC4501x.f f18299b0 = null;

        /* renamed from: c0 */
        public static final p221m9.AbstractC4501x.f f18300c0 = null;

        /* renamed from: d0 */
        public static final p221m9.AbstractC4501x.f f18301d0 = null;

        /* renamed from: e0 */
        public static final p221m9.AbstractC4501x.f f18302e0 = null;

        /* renamed from: f0 */
        public static final /* synthetic */ p221m9.AbstractC4501x.f[] f18303f0 = null;

        static {
                m9.x$f r0 = new m9.x$f
                java.lang.String r1 = "GET_MEMOIZED_IS_INITIALIZED"
                r2 = 0
                r0.<init>(r1, r2)
                p221m9.AbstractC4501x.f.f18296Y = r0
                m9.x$f r1 = new m9.x$f
                java.lang.String r3 = "SET_MEMOIZED_IS_INITIALIZED"
                r4 = 1
                r1.<init>(r3, r4)
                p221m9.AbstractC4501x.f.f18297Z = r1
                m9.x$f r3 = new m9.x$f
                java.lang.String r5 = "BUILD_MESSAGE_INFO"
                r6 = 2
                r3.<init>(r5, r6)
                p221m9.AbstractC4501x.f.f18298a0 = r3
                m9.x$f r5 = new m9.x$f
                java.lang.String r7 = "NEW_MUTABLE_INSTANCE"
                r8 = 3
                r5.<init>(r7, r8)
                p221m9.AbstractC4501x.f.f18299b0 = r5
                m9.x$f r7 = new m9.x$f
                java.lang.String r9 = "NEW_BUILDER"
                r10 = 4
                r7.<init>(r9, r10)
                p221m9.AbstractC4501x.f.f18300c0 = r7
                m9.x$f r9 = new m9.x$f
                java.lang.String r11 = "GET_DEFAULT_INSTANCE"
                r12 = 5
                r9.<init>(r11, r12)
                p221m9.AbstractC4501x.f.f18301d0 = r9
                m9.x$f r11 = new m9.x$f
                java.lang.String r13 = "GET_PARSER"
                r14 = 6
                r11.<init>(r13, r14)
                p221m9.AbstractC4501x.f.f18302e0 = r11
                r13 = 7
                m9.x$f[] r13 = new p221m9.AbstractC4501x.f[r13]
                r13[r2] = r0
                r13[r4] = r1
                r13[r6] = r3
                r13[r8] = r5
                r13[r10] = r7
                r13[r12] = r9
                r13[r14] = r11
                p221m9.AbstractC4501x.f.f18303f0 = r13
                return
        }

        f(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static p221m9.AbstractC4501x.f valueOf(java.lang.String r1) {
                java.lang.Class<m9.x$f> r0 = p221m9.AbstractC4501x.f.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                m9.x$f r1 = (p221m9.AbstractC4501x.f) r1
                return r1
        }

        public static p221m9.AbstractC4501x.f[] values() {
                m9.x$f[] r0 = p221m9.AbstractC4501x.f.f18303f0
                java.lang.Object r0 = r0.clone()
                m9.x$f[] r0 = (p221m9.AbstractC4501x.f[]) r0
                return r0
        }
    }

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p221m9.AbstractC4501x.defaultInstanceMap = r0
            return
    }

    public AbstractC4501x() {
            r1 = this;
            r1.<init>()
            m9.n1 r0 = p221m9.C4474n1.f18195f
            r1.unknownFields = r0
            r0 = -1
            r1.memoizedSerializedSize = r0
            return
    }

    /* renamed from: m */
    public static <T extends p221m9.AbstractC4501x<T, ?>> T m10366m(T r1) {
            boolean r0 = r1.mo10280j()
            if (r0 == 0) goto L7
            return r1
        L7:
            m9.l1 r1 = new m9.l1
            r1.<init>()
            m9.a0 r0 = new m9.a0
            java.lang.String r1 = r1.getMessage()
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: p */
    public static <T extends p221m9.AbstractC4501x<?, ?>> T m10367p(java.lang.Class<T> r3) {
            java.util.Map<java.lang.Object, m9.x<?, ?>> r0 = p221m9.AbstractC4501x.defaultInstanceMap
            java.lang.Object r0 = r0.get(r3)
            m9.x r0 = (p221m9.AbstractC4501x) r0
            if (r0 != 0) goto L28
            java.lang.String r0 = r3.getName()     // Catch: java.lang.ClassNotFoundException -> L1f
            r1 = 1
            java.lang.ClassLoader r2 = r3.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L1f
            java.lang.Class.forName(r0, r1, r2)     // Catch: java.lang.ClassNotFoundException -> L1f
            java.util.Map<java.lang.Object, m9.x<?, ?>> r0 = p221m9.AbstractC4501x.defaultInstanceMap
            java.lang.Object r0 = r0.get(r3)
            m9.x r0 = (p221m9.AbstractC4501x) r0
            goto L28
        L1f:
            r3 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Class initialization cannot fail."
            r0.<init>(r1, r3)
            throw r0
        L28:
            if (r0 != 0) goto L42
            java.lang.Object r0 = p221m9.C4483q1.m10237a(r3)
            m9.x r0 = (p221m9.AbstractC4501x) r0
            m9.x r0 = r0.m10374q()
            if (r0 == 0) goto L3c
            java.util.Map<java.lang.Object, m9.x<?, ?>> r1 = p221m9.AbstractC4501x.defaultInstanceMap
            r1.put(r3, r0)
            goto L42
        L3c:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
        L42:
            return r0
    }

    /* renamed from: r */
    public static java.lang.Object m10368r(java.lang.reflect.Method r0, java.lang.Object r1, java.lang.Object... r2) {
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L5 java.lang.IllegalAccessException -> L20
            return r0
        L5:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()
            boolean r1 = r0 instanceof java.lang.RuntimeException
            if (r1 != 0) goto L1d
            boolean r1 = r0 instanceof java.lang.Error
            if (r1 == 0) goto L15
            java.lang.Error r0 = (java.lang.Error) r0
            throw r0
        L15:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Unexpected exception thrown by generated accessor method."
            r1.<init>(r2, r0)
            throw r1
        L1d:
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            throw r0
        L20:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Couldn't use Java reflection to implement protocol message reflection."
            r1.<init>(r2, r0)
            throw r1
    }

    /* renamed from: s */
    public static <T extends p221m9.AbstractC4501x<T, ?>> T m10369s(T r0, p221m9.AbstractC4454h r1, p221m9.C4478p r2) {
            m9.i r1 = r1.mo10060p()     // Catch: p221m9.C4434a0 -> L12
            m9.x r0 = m10371u(r0, r1, r2)     // Catch: p221m9.C4434a0 -> L12
            r2 = 0
            r1.mo10076a(r2)     // Catch: p221m9.C4434a0 -> L10
            m10366m(r0)
            return r0
        L10:
            r0 = move-exception
            throw r0     // Catch: p221m9.C4434a0 -> L12
        L12:
            r0 = move-exception
            throw r0
    }

    /* renamed from: t */
    public static <T extends p221m9.AbstractC4501x<T, ?>> T m10370t(T r8, byte[] r9, p221m9.C4478p r10) {
            int r0 = r9.length
            m9.x$f r1 = p221m9.AbstractC4501x.f.f18299b0
            r2 = 0
            java.lang.Object r8 = r8.mo9340o(r1, r2, r2)
            m9.x r8 = (p221m9.AbstractC4501x) r8
            m9.a1 r1 = p221m9.C4435a1.f18092c     // Catch: java.lang.IndexOutOfBoundsException -> L30 java.io.IOException -> L35
            m9.e1 r7 = r1.m9904b(r8)     // Catch: java.lang.IndexOutOfBoundsException -> L30 java.io.IOException -> L35
            r1 = 0
            int r5 = r1 + r0
            m9.e$a r6 = new m9.e$a     // Catch: java.lang.IndexOutOfBoundsException -> L30 java.io.IOException -> L35
            r6.<init>(r10)     // Catch: java.lang.IndexOutOfBoundsException -> L30 java.io.IOException -> L35
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r1.mo9988c(r2, r3, r4, r5, r6)     // Catch: java.lang.IndexOutOfBoundsException -> L30 java.io.IOException -> L35
            r7.mo9989d(r8)     // Catch: java.lang.IndexOutOfBoundsException -> L30 java.io.IOException -> L35
            int r9 = r8.memoizedHashCode     // Catch: java.lang.IndexOutOfBoundsException -> L30 java.io.IOException -> L35
            if (r9 != 0) goto L2a
            m10366m(r8)
            return r8
        L2a:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException     // Catch: java.lang.IndexOutOfBoundsException -> L30 java.io.IOException -> L35
            r8.<init>()     // Catch: java.lang.IndexOutOfBoundsException -> L30 java.io.IOException -> L35
            throw r8     // Catch: java.lang.IndexOutOfBoundsException -> L30 java.io.IOException -> L35
        L30:
            m9.a0 r8 = p221m9.C4434a0.m9902h()
            throw r8
        L35:
            r8 = move-exception
            java.lang.Throwable r9 = r8.getCause()
            boolean r9 = r9 instanceof p221m9.C4434a0
            if (r9 == 0) goto L45
            java.lang.Throwable r8 = r8.getCause()
            m9.a0 r8 = (p221m9.C4434a0) r8
            throw r8
        L45:
            m9.a0 r9 = new m9.a0
            java.lang.String r8 = r8.getMessage()
            r9.<init>(r8)
            throw r9
    }

    /* renamed from: u */
    public static <T extends p221m9.AbstractC4501x<T, ?>> T m10371u(T r2, p221m9.AbstractC4457i r3, p221m9.C4478p r4) {
            m9.x$f r0 = p221m9.AbstractC4501x.f.f18299b0
            r1 = 0
            java.lang.Object r2 = r2.mo9340o(r0, r1, r1)
            m9.x r2 = (p221m9.AbstractC4501x) r2
            m9.a1 r0 = p221m9.C4435a1.f18092c     // Catch: java.lang.RuntimeException -> L20 java.io.IOException -> L22
            m9.e1 r0 = r0.m9904b(r2)     // Catch: java.lang.RuntimeException -> L20 java.io.IOException -> L22
            m9.j r1 = r3.f18149c     // Catch: java.lang.RuntimeException -> L20 java.io.IOException -> L22
            if (r1 == 0) goto L14
            goto L19
        L14:
            m9.j r1 = new m9.j     // Catch: java.lang.RuntimeException -> L20 java.io.IOException -> L22
            r1.<init>(r3)     // Catch: java.lang.RuntimeException -> L20 java.io.IOException -> L22
        L19:
            r0.mo9994i(r2, r1, r4)     // Catch: java.lang.RuntimeException -> L20 java.io.IOException -> L22
            r0.mo9989d(r2)     // Catch: java.lang.RuntimeException -> L20 java.io.IOException -> L22
            return r2
        L20:
            r2 = move-exception
            goto L24
        L22:
            r2 = move-exception
            goto L34
        L24:
            java.lang.Throwable r3 = r2.getCause()
            boolean r3 = r3 instanceof p221m9.C4434a0
            if (r3 == 0) goto L33
            java.lang.Throwable r2 = r2.getCause()
            m9.a0 r2 = (p221m9.C4434a0) r2
            throw r2
        L33:
            throw r2
        L34:
            java.lang.Throwable r3 = r2.getCause()
            boolean r3 = r3 instanceof p221m9.C4434a0
            if (r3 == 0) goto L43
            java.lang.Throwable r2 = r2.getCause()
            m9.a0 r2 = (p221m9.C4434a0) r2
            throw r2
        L43:
            m9.a0 r3 = new m9.a0
            java.lang.String r2 = r2.getMessage()
            r3.<init>(r2)
            throw r3
    }

    /* renamed from: v */
    public static <T extends p221m9.AbstractC4501x<?, ?>> void m10372v(java.lang.Class<T> r1, T r2) {
            java.util.Map<java.lang.Object, m9.x<?, ?>> r0 = p221m9.AbstractC4501x.defaultInstanceMap
            r0.put(r1, r2)
            return
    }

    @Override // p221m9.InterfaceC4482q0
    /* renamed from: a */
    public int mo10233a() {
            r2 = this;
            int r0 = r2.memoizedSerializedSize
            r1 = -1
            if (r0 != r1) goto L11
            m9.a1 r0 = p221m9.C4435a1.f18092c
            m9.e1 r0 = r0.m9904b(r2)
            int r0 = r0.mo9992g(r2)
            r2.memoizedSerializedSize = r0
        L11:
            int r0 = r2.memoizedSerializedSize
            return r0
    }

    @Override // p221m9.InterfaceC4485r0
    /* renamed from: b */
    public /* bridge */ /* synthetic */ p221m9.InterfaceC4482q0 mo10279b() {
            r1 = this;
            m9.x r0 = r1.m10374q()
            return r0
    }

    @Override // p221m9.InterfaceC4482q0
    /* renamed from: c */
    public p221m9.InterfaceC4482q0.a mo10234c() {
            r2 = this;
            m9.x$f r0 = p221m9.AbstractC4501x.f.f18300c0
            r1 = 0
            java.lang.Object r0 = r2.mo9340o(r0, r1, r1)
            m9.x$a r0 = (p221m9.AbstractC4501x.a) r0
            r0.m10377o()
            MessageType extends m9.x<MessageType, BuilderType> r1 = r0.f18293Z
            r0.m10379q(r1, r2)
            return r0
    }

    @Override // p221m9.InterfaceC4482q0
    /* renamed from: d */
    public void mo10235d(p221m9.AbstractC4463k r3) {
            r2 = this;
            m9.a1 r0 = p221m9.C4435a1.f18092c
            m9.e1 r0 = r0.m9904b(r2)
            m9.l r1 = r3.f18184a
            if (r1 == 0) goto Lb
            goto L10
        Lb:
            m9.l r1 = new m9.l
            r1.<init>(r3)
        L10:
            r0.mo9987b(r2, r1)
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            m9.x r0 = r1.m10374q()
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.isInstance(r2)
            if (r0 != 0) goto L14
            r2 = 0
            return r2
        L14:
            m9.a1 r0 = p221m9.C4435a1.f18092c
            m9.e1 r0 = r0.m9904b(r1)
            m9.x r2 = (p221m9.AbstractC4501x) r2
            boolean r2 = r0.mo9991f(r1, r2)
            return r2
    }

    @Override // p221m9.InterfaceC4482q0
    /* renamed from: f */
    public p221m9.InterfaceC4482q0.a mo10236f() {
            r2 = this;
            m9.x$f r0 = p221m9.AbstractC4501x.f.f18300c0
            r1 = 0
            java.lang.Object r0 = r2.mo9340o(r0, r1, r1)
            m9.x$a r0 = (p221m9.AbstractC4501x.a) r0
            return r0
    }

    @Override // p221m9.AbstractC4433a
    /* renamed from: h */
    public int mo9891h() {
            r1 = this;
            int r0 = r1.memoizedSerializedSize
            return r0
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.memoizedHashCode
            if (r0 == 0) goto L5
            return r0
        L5:
            m9.a1 r0 = p221m9.C4435a1.f18092c
            m9.e1 r0 = r0.m9904b(r1)
            int r0 = r0.mo9995j(r1)
            r1.memoizedHashCode = r0
            return r0
    }

    @Override // p221m9.InterfaceC4485r0
    /* renamed from: j */
    public final boolean mo10280j() {
            r4 = this;
            m9.x$f r0 = p221m9.AbstractC4501x.f.f18296Y
            r1 = 0
            java.lang.Object r0 = r4.mo9340o(r0, r1, r1)
            java.lang.Byte r0 = (java.lang.Byte) r0
            byte r0 = r0.byteValue()
            r2 = 1
            if (r0 != r2) goto L11
            goto L29
        L11:
            if (r0 != 0) goto L15
            r2 = 0
            goto L29
        L15:
            m9.a1 r0 = p221m9.C4435a1.f18092c
            m9.e1 r0 = r0.m9904b(r4)
            boolean r2 = r0.mo9990e(r4)
            m9.x$f r0 = p221m9.AbstractC4501x.f.f18297Z
            if (r2 == 0) goto L25
            r3 = r4
            goto L26
        L25:
            r3 = r1
        L26:
            r4.mo9340o(r0, r3, r1)
        L29:
            return r2
    }

    @Override // p221m9.AbstractC4433a
    /* renamed from: l */
    public void mo9894l(int r1) {
            r0 = this;
            r0.memoizedSerializedSize = r1
            return
    }

    /* renamed from: n */
    public final <MessageType extends p221m9.AbstractC4501x<MessageType, BuilderType>, BuilderType extends p221m9.AbstractC4501x.a<MessageType, BuilderType>> BuilderType m10373n() {
            r2 = this;
            m9.x$f r0 = p221m9.AbstractC4501x.f.f18300c0
            r1 = 0
            java.lang.Object r0 = r2.mo9340o(r0, r1, r1)
            m9.x$a r0 = (p221m9.AbstractC4501x.a) r0
            return r0
    }

    /* renamed from: o */
    public abstract java.lang.Object mo9340o(p221m9.AbstractC4501x.f r1, java.lang.Object r2, java.lang.Object r3);

    /* renamed from: q */
    public final MessageType m10374q() {
            r2 = this;
            m9.x$f r0 = p221m9.AbstractC4501x.f.f18301d0
            r1 = 0
            java.lang.Object r0 = r2.mo9340o(r0, r1, r1)
            m9.x r0 = (p221m9.AbstractC4501x) r0
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = super.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "# "
            r1.append(r2)
            r1.append(r0)
            r0 = 0
            p221m9.C4488s0.m10297c(r3, r1, r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
