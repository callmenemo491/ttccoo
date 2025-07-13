package p082ek;

/* renamed from: ek.f0 */
/* loaded from: classes.dex */
public final class C1893f0 {

    /* renamed from: a */
    public static final java.lang.reflect.Type[] f8160a = null;

    /* renamed from: ek.f0$a */
    public static final class a implements java.lang.reflect.GenericArrayType {

        /* renamed from: Y */
        public final java.lang.reflect.Type f8161Y;

        public a(java.lang.reflect.Type r1) {
                r0 = this;
                r0.<init>()
                r0.f8161Y = r1
                return
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.reflect.GenericArrayType
                if (r0 == 0) goto Le
                java.lang.reflect.GenericArrayType r2 = (java.lang.reflect.GenericArrayType) r2
                boolean r2 = p082ek.C1893f0.m4662c(r1, r2)
                if (r2 == 0) goto Le
                r2 = 1
                goto Lf
            Le:
                r2 = 0
            Lf:
                return r2
        }

        @Override // java.lang.reflect.GenericArrayType
        public java.lang.reflect.Type getGenericComponentType() {
                r1 = this;
                java.lang.reflect.Type r0 = r1.f8161Y
                return r0
        }

        public int hashCode() {
                r1 = this;
                java.lang.reflect.Type r0 = r1.f8161Y
                int r0 = r0.hashCode()
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.reflect.Type r1 = r2.f8161Y
                java.lang.String r1 = p082ek.C1893f0.m4675p(r1)
                r0.append(r1)
                java.lang.String r1 = "[]"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* renamed from: ek.f0$b */
    public static final class b implements java.lang.reflect.ParameterizedType {

        /* renamed from: Y */
        public final java.lang.reflect.Type f8162Y;

        /* renamed from: Z */
        public final java.lang.reflect.Type f8163Z;

        /* renamed from: a0 */
        public final java.lang.reflect.Type[] f8164a0;

        public b(java.lang.reflect.Type r5, java.lang.reflect.Type r6, java.lang.reflect.Type... r7) {
                r4 = this;
                r4.<init>()
                boolean r0 = r6 instanceof java.lang.Class
                r1 = 0
                if (r0 == 0) goto L22
                r0 = 1
                if (r5 != 0) goto Ld
                r2 = 1
                goto Le
            Ld:
                r2 = 0
            Le:
                r3 = r6
                java.lang.Class r3 = (java.lang.Class) r3
                java.lang.Class r3 = r3.getEnclosingClass()
                if (r3 != 0) goto L18
                goto L19
            L18:
                r0 = 0
            L19:
                if (r2 != r0) goto L1c
                goto L22
            L1c:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                r5.<init>()
                throw r5
            L22:
                int r0 = r7.length
            L23:
                if (r1 >= r0) goto L32
                r2 = r7[r1]
                java.lang.String r3 = "typeArgument == null"
                java.util.Objects.requireNonNull(r2, r3)
                p082ek.C1893f0.m4661b(r2)
                int r1 = r1 + 1
                goto L23
            L32:
                r4.f8162Y = r5
                r4.f8163Z = r6
                java.lang.Object r5 = r7.clone()
                java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
                r4.f8164a0 = r5
                return
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.reflect.ParameterizedType
                if (r0 == 0) goto Le
                java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
                boolean r2 = p082ek.C1893f0.m4662c(r1, r2)
                if (r2 == 0) goto Le
                r2 = 1
                goto Lf
            Le:
                r2 = 0
            Lf:
                return r2
        }

        @Override // java.lang.reflect.ParameterizedType
        public java.lang.reflect.Type[] getActualTypeArguments() {
                r1 = this;
                java.lang.reflect.Type[] r0 = r1.f8164a0
                java.lang.Object r0 = r0.clone()
                java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
                return r0
        }

        @Override // java.lang.reflect.ParameterizedType
        public java.lang.reflect.Type getOwnerType() {
                r1 = this;
                java.lang.reflect.Type r0 = r1.f8162Y
                return r0
        }

        @Override // java.lang.reflect.ParameterizedType
        public java.lang.reflect.Type getRawType() {
                r1 = this;
                java.lang.reflect.Type r0 = r1.f8163Z
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.reflect.Type[] r0 = r2.f8164a0
                int r0 = java.util.Arrays.hashCode(r0)
                java.lang.reflect.Type r1 = r2.f8163Z
                int r1 = r1.hashCode()
                r0 = r0 ^ r1
                java.lang.reflect.Type r1 = r2.f8162Y
                if (r1 == 0) goto L16
                int r1 = r1.hashCode()
                goto L17
            L16:
                r1 = 0
            L17:
                r0 = r0 ^ r1
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.reflect.Type[] r0 = r4.f8164a0
                int r1 = r0.length
                if (r1 != 0) goto Lc
                java.lang.reflect.Type r0 = r4.f8163Z
                java.lang.String r0 = p082ek.C1893f0.m4675p(r0)
                return r0
            Lc:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                int r0 = r0.length
                r2 = 1
                int r0 = r0 + r2
                int r0 = r0 * 30
                r1.<init>(r0)
                java.lang.reflect.Type r0 = r4.f8163Z
                java.lang.String r0 = p082ek.C1893f0.m4675p(r0)
                r1.append(r0)
                java.lang.String r0 = "<"
                r1.append(r0)
                java.lang.reflect.Type[] r0 = r4.f8164a0
                r3 = 0
                r0 = r0[r3]
                java.lang.String r0 = p082ek.C1893f0.m4675p(r0)
                r1.append(r0)
            L30:
                java.lang.reflect.Type[] r0 = r4.f8164a0
                int r0 = r0.length
                if (r2 >= r0) goto L48
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.reflect.Type[] r0 = r4.f8164a0
                r0 = r0[r2]
                java.lang.String r0 = p082ek.C1893f0.m4675p(r0)
                r1.append(r0)
                int r2 = r2 + 1
                goto L30
            L48:
                java.lang.String r0 = ">"
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
        }
    }

    /* renamed from: ek.f0$c */
    public static final class c implements java.lang.reflect.WildcardType {

        /* renamed from: Y */
        public final java.lang.reflect.Type f8165Y;

        /* renamed from: Z */
        public final java.lang.reflect.Type f8166Z;

        public c(java.lang.reflect.Type[] r5, java.lang.reflect.Type[] r6) {
                r4 = this;
                java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                r4.<init>()
                int r1 = r6.length
                r2 = 1
                if (r1 > r2) goto L43
                int r1 = r5.length
                if (r1 != r2) goto L3d
                int r1 = r6.length
                r3 = 0
                if (r1 != r2) goto L2b
                r1 = r6[r3]
                java.util.Objects.requireNonNull(r1)
                r1 = r6[r3]
                p082ek.C1893f0.m4661b(r1)
                r5 = r5[r3]
                if (r5 != r0) goto L25
                r5 = r6[r3]
                r4.f8166Z = r5
                r4.f8165Y = r0
                goto L3c
            L25:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                r5.<init>()
                throw r5
            L2b:
                r6 = r5[r3]
                java.util.Objects.requireNonNull(r6)
                r6 = r5[r3]
                p082ek.C1893f0.m4661b(r6)
                r6 = 0
                r4.f8166Z = r6
                r5 = r5[r3]
                r4.f8165Y = r5
            L3c:
                return
            L3d:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                r5.<init>()
                throw r5
            L43:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                r5.<init>()
                throw r5
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.reflect.WildcardType
                if (r0 == 0) goto Le
                java.lang.reflect.WildcardType r2 = (java.lang.reflect.WildcardType) r2
                boolean r2 = p082ek.C1893f0.m4662c(r1, r2)
                if (r2 == 0) goto Le
                r2 = 1
                goto Lf
            Le:
                r2 = 0
            Lf:
                return r2
        }

        @Override // java.lang.reflect.WildcardType
        public java.lang.reflect.Type[] getLowerBounds() {
                r3 = this;
                java.lang.reflect.Type r0 = r3.f8166Z
                if (r0 == 0) goto Lb
                r1 = 1
                java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r1]
                r2 = 0
                r1[r2] = r0
                goto Ld
            Lb:
                java.lang.reflect.Type[] r1 = p082ek.C1893f0.f8160a
            Ld:
                return r1
        }

        @Override // java.lang.reflect.WildcardType
        public java.lang.reflect.Type[] getUpperBounds() {
                r3 = this;
                r0 = 1
                java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
                java.lang.reflect.Type r1 = r3.f8165Y
                r2 = 0
                r0[r2] = r1
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.reflect.Type r0 = r2.f8166Z
                if (r0 == 0) goto Lb
                int r0 = r0.hashCode()
                int r0 = r0 + 31
                goto Lc
            Lb:
                r0 = 1
            Lc:
                java.lang.reflect.Type r1 = r2.f8165Y
                int r1 = r1.hashCode()
                int r1 = r1 + 31
                r0 = r0 ^ r1
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.reflect.Type r0 = r2.f8166Z
                if (r0 == 0) goto Ld
                java.lang.String r0 = "? super "
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.lang.reflect.Type r1 = r2.f8166Z
                goto L1e
            Ld:
                java.lang.reflect.Type r0 = r2.f8165Y
                java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                if (r0 != r1) goto L16
                java.lang.String r0 = "?"
                return r0
            L16:
                java.lang.String r0 = "? extends "
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.lang.reflect.Type r1 = r2.f8165Y
            L1e:
                java.lang.String r1 = p082ek.C1893f0.m4675p(r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            r0 = 0
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
            p082ek.C1893f0.f8160a = r0
            return
    }

    /* renamed from: a */
    public static bi.AbstractC0785h0 m4660a(bi.AbstractC0785h0 r4) {
            oi.e r0 = new oi.e
            r0.<init>()
            oi.h r1 = r4.mo2396l()
            r1.mo11573t(r0)
            bi.y r1 = r4.mo2395i()
            long r2 = r4.mo2394h()
            java.lang.String r4 = "content"
            p214m2.C4339q.m9706k(r0, r4)
            java.lang.String r4 = "$this$asResponseBody"
            p214m2.C4339q.m9706k(r0, r4)
            bi.i0 r4 = new bi.i0
            r4.<init>(r0, r1, r2)
            return r4
    }

    /* renamed from: b */
    public static void m4661b(java.lang.reflect.Type r1) {
            boolean r0 = r1 instanceof java.lang.Class
            if (r0 == 0) goto L13
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r1 = r1.isPrimitive()
            if (r1 != 0) goto Ld
            goto L13
        Ld:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        L13:
            return
    }

    /* renamed from: c */
    public static boolean m4662c(java.lang.reflect.Type r4, java.lang.reflect.Type r5) {
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof java.lang.Class
            if (r1 == 0) goto Ld
            boolean r4 = r4.equals(r5)
            return r4
        Ld:
            boolean r1 = r4 instanceof java.lang.reflect.ParameterizedType
            r2 = 0
            if (r1 == 0) goto L4c
            boolean r1 = r5 instanceof java.lang.reflect.ParameterizedType
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            java.lang.reflect.Type r1 = r4.getOwnerType()
            java.lang.reflect.Type r3 = r5.getOwnerType()
            if (r1 == r3) goto L2d
            if (r1 == 0) goto L4a
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L4a
        L2d:
            java.lang.reflect.Type r1 = r4.getRawType()
            java.lang.reflect.Type r3 = r5.getRawType()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L4a
            java.lang.reflect.Type[] r4 = r4.getActualTypeArguments()
            java.lang.reflect.Type[] r5 = r5.getActualTypeArguments()
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 == 0) goto L4a
            goto L4b
        L4a:
            r0 = 0
        L4b:
            return r0
        L4c:
            boolean r1 = r4 instanceof java.lang.reflect.GenericArrayType
            if (r1 == 0) goto L66
            boolean r0 = r5 instanceof java.lang.reflect.GenericArrayType
            if (r0 != 0) goto L55
            return r2
        L55:
            java.lang.reflect.GenericArrayType r4 = (java.lang.reflect.GenericArrayType) r4
            java.lang.reflect.GenericArrayType r5 = (java.lang.reflect.GenericArrayType) r5
            java.lang.reflect.Type r4 = r4.getGenericComponentType()
            java.lang.reflect.Type r5 = r5.getGenericComponentType()
            boolean r4 = m4662c(r4, r5)
            return r4
        L66:
            boolean r1 = r4 instanceof java.lang.reflect.WildcardType
            if (r1 == 0) goto L92
            boolean r1 = r5 instanceof java.lang.reflect.WildcardType
            if (r1 != 0) goto L6f
            return r2
        L6f:
            java.lang.reflect.WildcardType r4 = (java.lang.reflect.WildcardType) r4
            java.lang.reflect.WildcardType r5 = (java.lang.reflect.WildcardType) r5
            java.lang.reflect.Type[] r1 = r4.getUpperBounds()
            java.lang.reflect.Type[] r3 = r5.getUpperBounds()
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto L90
            java.lang.reflect.Type[] r4 = r4.getLowerBounds()
            java.lang.reflect.Type[] r5 = r5.getLowerBounds()
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 == 0) goto L90
            goto L91
        L90:
            r0 = 0
        L91:
            return r0
        L92:
            boolean r1 = r4 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto Lba
            boolean r1 = r5 instanceof java.lang.reflect.TypeVariable
            if (r1 != 0) goto L9b
            return r2
        L9b:
            java.lang.reflect.TypeVariable r4 = (java.lang.reflect.TypeVariable) r4
            java.lang.reflect.TypeVariable r5 = (java.lang.reflect.TypeVariable) r5
            java.lang.reflect.GenericDeclaration r1 = r4.getGenericDeclaration()
            java.lang.reflect.GenericDeclaration r3 = r5.getGenericDeclaration()
            if (r1 != r3) goto Lb8
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = r5.getName()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto Lb8
            goto Lb9
        Lb8:
            r0 = 0
        Lb9:
            return r0
        Lba:
            return r2
    }

    /* renamed from: d */
    public static java.lang.reflect.Type m4663d(java.lang.reflect.Type r3, java.lang.Class<?> r4, java.lang.Class<?> r5) {
            if (r5 != r4) goto L3
            return r3
        L3:
            boolean r3 = r5.isInterface()
            if (r3 == 0) goto L34
            java.lang.Class[] r3 = r4.getInterfaces()
            r0 = 0
            int r1 = r3.length
        Lf:
            if (r0 >= r1) goto L34
            r2 = r3[r0]
            if (r2 != r5) goto L1c
            java.lang.reflect.Type[] r3 = r4.getGenericInterfaces()
            r3 = r3[r0]
            return r3
        L1c:
            r2 = r3[r0]
            boolean r2 = r5.isAssignableFrom(r2)
            if (r2 == 0) goto L31
            java.lang.reflect.Type[] r4 = r4.getGenericInterfaces()
            r4 = r4[r0]
            r3 = r3[r0]
            java.lang.reflect.Type r3 = m4663d(r4, r3, r5)
            return r3
        L31:
            int r0 = r0 + 1
            goto Lf
        L34:
            boolean r3 = r4.isInterface()
            if (r3 != 0) goto L5a
        L3a:
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            if (r4 == r3) goto L5a
            java.lang.Class r3 = r4.getSuperclass()
            if (r3 != r5) goto L49
            java.lang.reflect.Type r3 = r4.getGenericSuperclass()
            return r3
        L49:
            boolean r0 = r5.isAssignableFrom(r3)
            if (r0 == 0) goto L58
            java.lang.reflect.Type r4 = r4.getGenericSuperclass()
            java.lang.reflect.Type r3 = m4663d(r4, r3, r5)
            return r3
        L58:
            r4 = r3
            goto L3a
        L5a:
            return r5
    }

    /* renamed from: e */
    public static java.lang.reflect.Type m4664e(int r4, java.lang.reflect.ParameterizedType r5) {
            java.lang.reflect.Type[] r0 = r5.getActualTypeArguments()
            if (r4 < 0) goto L19
            int r1 = r0.length
            if (r4 >= r1) goto L19
            r4 = r0[r4]
            boolean r5 = r4 instanceof java.lang.reflect.WildcardType
            if (r5 == 0) goto L18
            java.lang.reflect.WildcardType r4 = (java.lang.reflect.WildcardType) r4
            java.lang.reflect.Type[] r4 = r4.getUpperBounds()
            r5 = 0
            r4 = r4[r5]
        L18:
            return r4
        L19:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Index "
            java.lang.String r3 = " not in range [0,"
            java.lang.StringBuilder r4 = androidx.appcompat.widget.C0300r0.m777a(r2, r4, r3)
            int r0 = r0.length
            r4.append(r0)
            java.lang.String r0 = ") for "
            r4.append(r0)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r1.<init>(r4)
            throw r1
    }

    /* renamed from: f */
    public static java.lang.Class<?> m4665f(java.lang.reflect.Type r3) {
            java.lang.String r0 = "type == null"
            java.util.Objects.requireNonNull(r3, r0)
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto Lc
            java.lang.Class r3 = (java.lang.Class) r3
            return r3
        Lc:
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L23
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.reflect.Type r3 = r3.getRawType()
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto L1d
            java.lang.Class r3 = (java.lang.Class) r3
            return r3
        L1d:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
        L23:
            boolean r0 = r3 instanceof java.lang.reflect.GenericArrayType
            r1 = 0
            if (r0 == 0) goto L3b
            java.lang.reflect.GenericArrayType r3 = (java.lang.reflect.GenericArrayType) r3
            java.lang.reflect.Type r3 = r3.getGenericComponentType()
            java.lang.Class r3 = m4665f(r3)
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r3, r1)
            java.lang.Class r3 = r3.getClass()
            return r3
        L3b:
            boolean r0 = r3 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L42
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            return r3
        L42:
            boolean r0 = r3 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L53
            java.lang.reflect.WildcardType r3 = (java.lang.reflect.WildcardType) r3
            java.lang.reflect.Type[] r3 = r3.getUpperBounds()
            r3 = r3[r1]
            java.lang.Class r3 = m4665f(r3)
            return r3
        L53:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected a Class, ParameterizedType, or GenericArrayType, but <"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = "> is of type "
            r1.append(r2)
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    /* renamed from: g */
    public static java.lang.reflect.Type m4666g(java.lang.reflect.Type r1, java.lang.Class<?> r2, java.lang.Class<?> r3) {
            boolean r0 = r3.isAssignableFrom(r2)
            if (r0 == 0) goto Lf
            java.lang.reflect.Type r3 = m4663d(r1, r2, r3)
            java.lang.reflect.Type r1 = m4673n(r1, r2, r3)
            return r1
        Lf:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
    }

    /* renamed from: h */
    public static boolean m4667h(java.lang.reflect.Type r5) {
            boolean r0 = r5 instanceof java.lang.Class
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            boolean r0 = r5 instanceof java.lang.reflect.ParameterizedType
            r2 = 1
            if (r0 == 0) goto L22
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            java.lang.reflect.Type[] r5 = r5.getActualTypeArguments()
            int r0 = r5.length
            r3 = 0
        L13:
            if (r3 >= r0) goto L21
            r4 = r5[r3]
            boolean r4 = m4667h(r4)
            if (r4 == 0) goto L1e
            return r2
        L1e:
            int r3 = r3 + 1
            goto L13
        L21:
            return r1
        L22:
            boolean r0 = r5 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L31
            java.lang.reflect.GenericArrayType r5 = (java.lang.reflect.GenericArrayType) r5
            java.lang.reflect.Type r5 = r5.getGenericComponentType()
            boolean r5 = m4667h(r5)
            return r5
        L31:
            boolean r0 = r5 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L36
            return r2
        L36:
            boolean r0 = r5 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L3b
            return r2
        L3b:
            if (r5 != 0) goto L40
            java.lang.String r0 = "null"
            goto L48
        L40:
            java.lang.Class r0 = r5.getClass()
            java.lang.String r0 = r0.getName()
        L48:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected a Class, ParameterizedType, or GenericArrayType, but <"
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = "> is of type "
            r2.append(r5)
            r2.append(r0)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5)
            throw r1
    }

    /* renamed from: i */
    public static boolean m4668i(java.lang.annotation.Annotation[] r4, java.lang.Class<? extends java.lang.annotation.Annotation> r5) {
            int r0 = r4.length
            r1 = 0
            r2 = 0
        L3:
            if (r2 >= r0) goto L12
            r3 = r4[r2]
            boolean r3 = r5.isInstance(r3)
            if (r3 == 0) goto Lf
            r4 = 1
            return r4
        Lf:
            int r2 = r2 + 1
            goto L3
        L12:
            return r1
    }

    /* renamed from: j */
    public static java.lang.RuntimeException m4669j(java.lang.reflect.Method r1, java.lang.String r2, java.lang.Object... r3) {
            r0 = 0
            java.lang.RuntimeException r1 = m4670k(r1, r0, r2, r3)
            return r1
    }

    /* renamed from: k */
    public static java.lang.RuntimeException m4670k(java.lang.reflect.Method r1, java.lang.Throwable r2, java.lang.String r3, java.lang.Object... r4) {
            java.lang.String r3 = java.lang.String.format(r3, r4)
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "\n    for method "
            java.lang.StringBuilder r3 = android.support.v4.media.C0143b.m255a(r3, r0)
            java.lang.Class r0 = r1.getDeclaringClass()
            java.lang.String r0 = r0.getSimpleName()
            r3.append(r0)
            java.lang.String r0 = "."
            r3.append(r0)
            java.lang.String r1 = r1.getName()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r4.<init>(r1, r2)
            return r4
    }

    /* renamed from: l */
    public static java.lang.RuntimeException m4671l(java.lang.reflect.Method r1, int r2, java.lang.String r3, java.lang.Object... r4) {
            java.lang.String r0 = " (parameter #"
            java.lang.StringBuilder r3 = android.support.v4.media.C0143b.m255a(r3, r0)
            int r2 = r2 + 1
            r3.append(r2)
            java.lang.String r2 = ")"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.RuntimeException r1 = m4669j(r1, r2, r4)
            return r1
    }

    /* renamed from: m */
    public static java.lang.RuntimeException m4672m(java.lang.reflect.Method r1, java.lang.Throwable r2, int r3, java.lang.String r4, java.lang.Object... r5) {
            java.lang.String r0 = " (parameter #"
            java.lang.StringBuilder r4 = android.support.v4.media.C0143b.m255a(r4, r0)
            int r3 = r3 + 1
            r4.append(r3)
            java.lang.String r3 = ")"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.RuntimeException r1 = m4670k(r1, r2, r3, r5)
            return r1
    }

    /* renamed from: n */
    public static java.lang.reflect.Type m4673n(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10) {
        L0:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            r1 = 0
            if (r0 == 0) goto L45
            java.lang.reflect.TypeVariable r10 = (java.lang.reflect.TypeVariable) r10
            java.lang.reflect.GenericDeclaration r0 = r10.getGenericDeclaration()
            boolean r2 = r0 instanceof java.lang.Class
            if (r2 == 0) goto L12
            java.lang.Class r0 = (java.lang.Class) r0
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 != 0) goto L16
            goto L3f
        L16:
            java.lang.reflect.Type r2 = m4663d(r8, r9, r0)
            boolean r3 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L3f
            java.lang.reflect.TypeVariable[] r0 = r0.getTypeParameters()
        L22:
            int r3 = r0.length
            if (r1 >= r3) goto L39
            r3 = r0[r1]
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L36
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            java.lang.reflect.Type[] r0 = r2.getActualTypeArguments()
            r0 = r0[r1]
            goto L40
        L36:
            int r1 = r1 + 1
            goto L22
        L39:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            r8.<init>()
            throw r8
        L3f:
            r0 = r10
        L40:
            if (r0 != r10) goto L43
            return r0
        L43:
            r10 = r0
            goto L0
        L45:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L63
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r2 = r0.isArray()
            if (r2 == 0) goto L63
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = m4673n(r8, r9, r10)
            if (r10 != r8) goto L5d
            goto L62
        L5d:
            ek.f0$a r0 = new ek.f0$a
            r0.<init>(r8)
        L62:
            return r0
        L63:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L7a
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = m4673n(r8, r9, r0)
            if (r0 != r8) goto L74
            goto L79
        L74:
            ek.f0$a r10 = new ek.f0$a
            r10.<init>(r8)
        L79:
            return r10
        L7a:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r2 = 1
            if (r0 == 0) goto Lbb
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = m4673n(r8, r9, r0)
            if (r3 == r0) goto L8d
            r0 = 1
            goto L8e
        L8d:
            r0 = 0
        L8e:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L93:
            if (r1 >= r5) goto Lae
            r6 = r4[r1]
            java.lang.reflect.Type r6 = m4673n(r8, r9, r6)
            r7 = r4[r1]
            if (r6 == r7) goto Lab
            if (r0 != 0) goto La9
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = 1
        La9:
            r4[r1] = r6
        Lab:
            int r1 = r1 + 1
            goto L93
        Lae:
            if (r0 == 0) goto Lba
            ek.f0$b r8 = new ek.f0$b
            java.lang.reflect.Type r9 = r10.getRawType()
            r8.<init>(r3, r9, r4)
            r10 = r8
        Lba:
            return r10
        Lbb:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L101
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r2) goto Le6
            r3 = r0[r1]
            java.lang.reflect.Type r8 = m4673n(r8, r9, r3)
            r9 = r0[r1]
            if (r8 == r9) goto L101
            ek.f0$c r9 = new ek.f0$c
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r2]
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r10[r1] = r0
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r2]
            r0[r1] = r8
            r9.<init>(r10, r0)
            return r9
        Le6:
            int r0 = r3.length
            if (r0 != r2) goto L101
            r0 = r3[r1]
            java.lang.reflect.Type r8 = m4673n(r8, r9, r0)     // Catch: java.lang.Throwable -> Lff
            r9 = r3[r1]
            if (r8 == r9) goto L101
            ek.f0$c r9 = new ek.f0$c
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r2]
            r10[r1] = r8
            java.lang.reflect.Type[] r8 = p082ek.C1893f0.f8160a
            r9.<init>(r10, r8)
            return r9
        Lff:
            r8 = move-exception
            throw r8
        L101:
            return r10
    }

    /* renamed from: o */
    public static void m4674o(java.lang.Throwable r1) {
            boolean r0 = r1 instanceof java.lang.VirtualMachineError
            if (r0 != 0) goto L13
            boolean r0 = r1 instanceof java.lang.ThreadDeath
            if (r0 != 0) goto L10
            boolean r0 = r1 instanceof java.lang.LinkageError
            if (r0 != 0) goto Ld
            return
        Ld:
            java.lang.LinkageError r1 = (java.lang.LinkageError) r1
            throw r1
        L10:
            java.lang.ThreadDeath r1 = (java.lang.ThreadDeath) r1
            throw r1
        L13:
            java.lang.VirtualMachineError r1 = (java.lang.VirtualMachineError) r1
            throw r1
    }

    /* renamed from: p */
    public static java.lang.String m4675p(java.lang.reflect.Type r1) {
            boolean r0 = r1 instanceof java.lang.Class
            if (r0 == 0) goto Lb
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.String r1 = r1.getName()
            goto Lf
        Lb:
            java.lang.String r1 = r1.toString()
        Lf:
            return r1
    }
}
