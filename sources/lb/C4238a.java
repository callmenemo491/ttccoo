package lb;

/* renamed from: lb.a */
/* loaded from: classes.dex */
public final class C4238a {

    /* renamed from: a */
    public static final java.lang.reflect.Type[] f17407a = null;

    /* renamed from: lb.a$a */
    public static final class a implements java.lang.reflect.GenericArrayType, java.io.Serializable {

        /* renamed from: Y */
        public final java.lang.reflect.Type f17408Y;

        public a(java.lang.reflect.Type r1) {
                r0 = this;
                r0.<init>()
                java.lang.reflect.Type r1 = lb.C4238a.m9545a(r1)
                r0.f17408Y = r1
                return
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.reflect.GenericArrayType
                if (r0 == 0) goto Le
                java.lang.reflect.GenericArrayType r2 = (java.lang.reflect.GenericArrayType) r2
                boolean r2 = lb.C4238a.m9547c(r1, r2)
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
                java.lang.reflect.Type r0 = r1.f17408Y
                return r0
        }

        public int hashCode() {
                r1 = this;
                java.lang.reflect.Type r0 = r1.f17408Y
                int r0 = r0.hashCode()
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.reflect.Type r1 = r2.f17408Y
                java.lang.String r1 = lb.C4238a.m9553i(r1)
                r0.append(r1)
                java.lang.String r1 = "[]"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* renamed from: lb.a$b */
    public static final class b implements java.lang.reflect.ParameterizedType, java.io.Serializable {

        /* renamed from: Y */
        public final java.lang.reflect.Type f17409Y;

        /* renamed from: Z */
        public final java.lang.reflect.Type f17410Z;

        /* renamed from: a0 */
        public final java.lang.reflect.Type[] f17411a0;

        public b(java.lang.reflect.Type r5, java.lang.reflect.Type r6, java.lang.reflect.Type... r7) {
                r4 = this;
                r4.<init>()
                boolean r0 = r6 instanceof java.lang.Class
                r1 = 0
                if (r0 == 0) goto L29
                r0 = r6
                java.lang.Class r0 = (java.lang.Class) r0
                int r2 = r0.getModifiers()
                boolean r2 = java.lang.reflect.Modifier.isStatic(r2)
                r3 = 1
                if (r2 != 0) goto L1f
                java.lang.Class r0 = r0.getEnclosingClass()
                if (r0 != 0) goto L1d
                goto L1f
            L1d:
                r0 = 0
                goto L20
            L1f:
                r0 = 1
            L20:
                if (r5 != 0) goto L26
                if (r0 == 0) goto L25
                goto L26
            L25:
                r3 = 0
            L26:
                p185k7.C3828h5.m8587b(r3)
            L29:
                if (r5 != 0) goto L2d
                r5 = 0
                goto L31
            L2d:
                java.lang.reflect.Type r5 = lb.C4238a.m9545a(r5)
            L31:
                r4.f17409Y = r5
                java.lang.reflect.Type r5 = lb.C4238a.m9545a(r6)
                r4.f17410Z = r5
                java.lang.Object r5 = r7.clone()
                java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
                r4.f17411a0 = r5
                int r5 = r5.length
            L42:
                if (r1 >= r5) goto L5f
                java.lang.reflect.Type[] r6 = r4.f17411a0
                r6 = r6[r1]
                java.util.Objects.requireNonNull(r6)
                java.lang.reflect.Type[] r6 = r4.f17411a0
                r6 = r6[r1]
                lb.C4238a.m9546b(r6)
                java.lang.reflect.Type[] r6 = r4.f17411a0
                r7 = r6[r1]
                java.lang.reflect.Type r7 = lb.C4238a.m9545a(r7)
                r6[r1] = r7
                int r1 = r1 + 1
                goto L42
            L5f:
                return
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.reflect.ParameterizedType
                if (r0 == 0) goto Le
                java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
                boolean r2 = lb.C4238a.m9547c(r1, r2)
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
                java.lang.reflect.Type[] r0 = r1.f17411a0
                java.lang.Object r0 = r0.clone()
                java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
                return r0
        }

        @Override // java.lang.reflect.ParameterizedType
        public java.lang.reflect.Type getOwnerType() {
                r1 = this;
                java.lang.reflect.Type r0 = r1.f17409Y
                return r0
        }

        @Override // java.lang.reflect.ParameterizedType
        public java.lang.reflect.Type getRawType() {
                r1 = this;
                java.lang.reflect.Type r0 = r1.f17410Z
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.reflect.Type[] r0 = r2.f17411a0
                int r0 = java.util.Arrays.hashCode(r0)
                java.lang.reflect.Type r1 = r2.f17410Z
                int r1 = r1.hashCode()
                r0 = r0 ^ r1
                java.lang.reflect.Type r1 = r2.f17409Y
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
                java.lang.reflect.Type[] r0 = r4.f17411a0
                int r0 = r0.length
                if (r0 != 0) goto Lc
                java.lang.reflect.Type r0 = r4.f17410Z
                java.lang.String r0 = lb.C4238a.m9553i(r0)
                return r0
            Lc:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                int r2 = r0 + 1
                int r2 = r2 * 30
                r1.<init>(r2)
                java.lang.reflect.Type r2 = r4.f17410Z
                java.lang.String r2 = lb.C4238a.m9553i(r2)
                r1.append(r2)
                java.lang.String r2 = "<"
                r1.append(r2)
                java.lang.reflect.Type[] r2 = r4.f17411a0
                r3 = 0
                r2 = r2[r3]
                java.lang.String r2 = lb.C4238a.m9553i(r2)
                r1.append(r2)
                r2 = 1
            L30:
                if (r2 >= r0) goto L45
                java.lang.String r3 = ", "
                r1.append(r3)
                java.lang.reflect.Type[] r3 = r4.f17411a0
                r3 = r3[r2]
                java.lang.String r3 = lb.C4238a.m9553i(r3)
                r1.append(r3)
                int r2 = r2 + 1
                goto L30
            L45:
                java.lang.String r0 = ">"
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
        }
    }

    /* renamed from: lb.a$c */
    public static final class c implements java.lang.reflect.WildcardType, java.io.Serializable {

        /* renamed from: Y */
        public final java.lang.reflect.Type f17412Y;

        /* renamed from: Z */
        public final java.lang.reflect.Type f17413Z;

        public c(java.lang.reflect.Type[] r5, java.lang.reflect.Type[] r6) {
                r4 = this;
                java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                r4.<init>()
                int r1 = r6.length
                r2 = 1
                r3 = 0
                if (r1 > r2) goto Lc
                r1 = 1
                goto Ld
            Lc:
                r1 = 0
            Ld:
                p185k7.C3828h5.m8587b(r1)
                int r1 = r5.length
                if (r1 != r2) goto L15
                r1 = 1
                goto L16
            L15:
                r1 = 0
            L16:
                p185k7.C3828h5.m8587b(r1)
                int r1 = r6.length
                if (r1 != r2) goto L3a
                r1 = r6[r3]
                java.util.Objects.requireNonNull(r1)
                r1 = r6[r3]
                lb.C4238a.m9546b(r1)
                r5 = r5[r3]
                if (r5 != r0) goto L2b
                goto L2c
            L2b:
                r2 = 0
            L2c:
                p185k7.C3828h5.m8587b(r2)
                r5 = r6[r3]
                java.lang.reflect.Type r5 = lb.C4238a.m9545a(r5)
                r4.f17413Z = r5
                r4.f17412Y = r0
                goto L4f
            L3a:
                r6 = r5[r3]
                java.util.Objects.requireNonNull(r6)
                r6 = r5[r3]
                lb.C4238a.m9546b(r6)
                r6 = 0
                r4.f17413Z = r6
                r5 = r5[r3]
                java.lang.reflect.Type r5 = lb.C4238a.m9545a(r5)
                r4.f17412Y = r5
            L4f:
                return
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.reflect.WildcardType
                if (r0 == 0) goto Le
                java.lang.reflect.WildcardType r2 = (java.lang.reflect.WildcardType) r2
                boolean r2 = lb.C4238a.m9547c(r1, r2)
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
                java.lang.reflect.Type r0 = r3.f17413Z
                if (r0 == 0) goto Lb
                r1 = 1
                java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r1]
                r2 = 0
                r1[r2] = r0
                goto Ld
            Lb:
                java.lang.reflect.Type[] r1 = lb.C4238a.f17407a
            Ld:
                return r1
        }

        @Override // java.lang.reflect.WildcardType
        public java.lang.reflect.Type[] getUpperBounds() {
                r3 = this;
                r0 = 1
                java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
                java.lang.reflect.Type r1 = r3.f17412Y
                r2 = 0
                r0[r2] = r1
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.reflect.Type r0 = r2.f17413Z
                if (r0 == 0) goto Lb
                int r0 = r0.hashCode()
                int r0 = r0 + 31
                goto Lc
            Lb:
                r0 = 1
            Lc:
                java.lang.reflect.Type r1 = r2.f17412Y
                int r1 = r1.hashCode()
                int r1 = r1 + 31
                r0 = r0 ^ r1
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.reflect.Type r0 = r2.f17413Z
                if (r0 == 0) goto Ld
                java.lang.String r0 = "? super "
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.lang.reflect.Type r1 = r2.f17413Z
                goto L1e
            Ld:
                java.lang.reflect.Type r0 = r2.f17412Y
                java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                if (r0 != r1) goto L16
                java.lang.String r0 = "?"
                return r0
            L16:
                java.lang.String r0 = "? extends "
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.lang.reflect.Type r1 = r2.f17412Y
            L1e:
                java.lang.String r1 = lb.C4238a.m9553i(r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            r0 = 0
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
            lb.C4238a.f17407a = r0
            return
    }

    /* renamed from: a */
    public static java.lang.reflect.Type m9545a(java.lang.reflect.Type r3) {
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto L1b
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r0 = r3.isArray()
            if (r0 == 0) goto L1a
            lb.a$a r0 = new lb.a$a
            java.lang.Class r3 = r3.getComponentType()
            java.lang.reflect.Type r3 = m9545a(r3)
            r0.<init>(r3)
            r3 = r0
        L1a:
            return r3
        L1b:
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L33
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            lb.a$b r0 = new lb.a$b
            java.lang.reflect.Type r1 = r3.getOwnerType()
            java.lang.reflect.Type r2 = r3.getRawType()
            java.lang.reflect.Type[] r3 = r3.getActualTypeArguments()
            r0.<init>(r1, r2, r3)
            return r0
        L33:
            boolean r0 = r3 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L43
            java.lang.reflect.GenericArrayType r3 = (java.lang.reflect.GenericArrayType) r3
            lb.a$a r0 = new lb.a$a
            java.lang.reflect.Type r3 = r3.getGenericComponentType()
            r0.<init>(r3)
            return r0
        L43:
            boolean r0 = r3 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L57
            java.lang.reflect.WildcardType r3 = (java.lang.reflect.WildcardType) r3
            lb.a$c r0 = new lb.a$c
            java.lang.reflect.Type[] r1 = r3.getUpperBounds()
            java.lang.reflect.Type[] r3 = r3.getLowerBounds()
            r0.<init>(r1, r3)
            return r0
        L57:
            return r3
    }

    /* renamed from: b */
    public static void m9546b(java.lang.reflect.Type r1) {
            boolean r0 = r1 instanceof java.lang.Class
            if (r0 == 0) goto Lf
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r1 = r1.isPrimitive()
            if (r1 != 0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            goto L10
        Lf:
            r1 = 1
        L10:
            p185k7.C3828h5.m8587b(r1)
            return
    }

    /* renamed from: c */
    public static boolean m9547c(java.lang.reflect.Type r4, java.lang.reflect.Type r5) {
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
            if (r1 == 0) goto L52
            boolean r1 = r5 instanceof java.lang.reflect.ParameterizedType
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            java.lang.reflect.Type r1 = r4.getOwnerType()
            java.lang.reflect.Type r3 = r5.getOwnerType()
            if (r1 == r3) goto L30
            if (r1 == 0) goto L2e
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L2e
            goto L30
        L2e:
            r1 = 0
            goto L31
        L30:
            r1 = 1
        L31:
            if (r1 == 0) goto L50
            java.lang.reflect.Type r1 = r4.getRawType()
            java.lang.reflect.Type r3 = r5.getRawType()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L50
            java.lang.reflect.Type[] r4 = r4.getActualTypeArguments()
            java.lang.reflect.Type[] r5 = r5.getActualTypeArguments()
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 == 0) goto L50
            goto L51
        L50:
            r0 = 0
        L51:
            return r0
        L52:
            boolean r1 = r4 instanceof java.lang.reflect.GenericArrayType
            if (r1 == 0) goto L6c
            boolean r0 = r5 instanceof java.lang.reflect.GenericArrayType
            if (r0 != 0) goto L5b
            return r2
        L5b:
            java.lang.reflect.GenericArrayType r4 = (java.lang.reflect.GenericArrayType) r4
            java.lang.reflect.GenericArrayType r5 = (java.lang.reflect.GenericArrayType) r5
            java.lang.reflect.Type r4 = r4.getGenericComponentType()
            java.lang.reflect.Type r5 = r5.getGenericComponentType()
            boolean r4 = m9547c(r4, r5)
            return r4
        L6c:
            boolean r1 = r4 instanceof java.lang.reflect.WildcardType
            if (r1 == 0) goto L98
            boolean r1 = r5 instanceof java.lang.reflect.WildcardType
            if (r1 != 0) goto L75
            return r2
        L75:
            java.lang.reflect.WildcardType r4 = (java.lang.reflect.WildcardType) r4
            java.lang.reflect.WildcardType r5 = (java.lang.reflect.WildcardType) r5
            java.lang.reflect.Type[] r1 = r4.getUpperBounds()
            java.lang.reflect.Type[] r3 = r5.getUpperBounds()
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto L96
            java.lang.reflect.Type[] r4 = r4.getLowerBounds()
            java.lang.reflect.Type[] r5 = r5.getLowerBounds()
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 == 0) goto L96
            goto L97
        L96:
            r0 = 0
        L97:
            return r0
        L98:
            boolean r1 = r4 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto Lc0
            boolean r1 = r5 instanceof java.lang.reflect.TypeVariable
            if (r1 != 0) goto La1
            return r2
        La1:
            java.lang.reflect.TypeVariable r4 = (java.lang.reflect.TypeVariable) r4
            java.lang.reflect.TypeVariable r5 = (java.lang.reflect.TypeVariable) r5
            java.lang.reflect.GenericDeclaration r1 = r4.getGenericDeclaration()
            java.lang.reflect.GenericDeclaration r3 = r5.getGenericDeclaration()
            if (r1 != r3) goto Lbe
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = r5.getName()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto Lbe
            goto Lbf
        Lbe:
            r0 = 0
        Lbf:
            return r0
        Lc0:
            return r2
    }

    /* renamed from: d */
    public static java.lang.reflect.Type m9548d(java.lang.reflect.Type r3, java.lang.Class<?> r4, java.lang.Class<?> r5) {
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
            java.lang.reflect.Type r3 = m9548d(r4, r3, r5)
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
            java.lang.reflect.Type r3 = m9548d(r4, r3, r5)
            return r3
        L58:
            r4 = r3
            goto L3a
        L5a:
            return r5
    }

    /* renamed from: e */
    public static java.lang.Class<?> m9549e(java.lang.reflect.Type r4) {
            boolean r0 = r4 instanceof java.lang.Class
            if (r0 == 0) goto L7
            java.lang.Class r4 = (java.lang.Class) r4
            return r4
        L7:
            boolean r0 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L19
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.Type r4 = r4.getRawType()
            boolean r0 = r4 instanceof java.lang.Class
            p185k7.C3828h5.m8587b(r0)
            java.lang.Class r4 = (java.lang.Class) r4
            return r4
        L19:
            boolean r0 = r4 instanceof java.lang.reflect.GenericArrayType
            r1 = 0
            if (r0 == 0) goto L31
            java.lang.reflect.GenericArrayType r4 = (java.lang.reflect.GenericArrayType) r4
            java.lang.reflect.Type r4 = r4.getGenericComponentType()
            java.lang.Class r4 = m9549e(r4)
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r1)
            java.lang.Class r4 = r4.getClass()
            return r4
        L31:
            boolean r0 = r4 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L38
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            return r4
        L38:
            boolean r0 = r4 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L49
            java.lang.reflect.WildcardType r4 = (java.lang.reflect.WildcardType) r4
            java.lang.reflect.Type[] r4 = r4.getUpperBounds()
            r4 = r4[r1]
            java.lang.Class r4 = m9549e(r4)
            return r4
        L49:
            if (r4 != 0) goto L4e
            java.lang.String r0 = "null"
            goto L56
        L4e:
            java.lang.Class r0 = r4.getClass()
            java.lang.String r0 = r0.getName()
        L56:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected a Class, ParameterizedType, or GenericArrayType, but <"
            r2.append(r3)
            r2.append(r4)
            java.lang.String r4 = "> is of type "
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            throw r1
    }

    /* renamed from: f */
    public static java.lang.reflect.Type m9550f(java.lang.reflect.Type r1, java.lang.Class<?> r2, java.lang.Class<?> r3) {
            boolean r0 = r1 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto Ld
            java.lang.reflect.WildcardType r1 = (java.lang.reflect.WildcardType) r1
            java.lang.reflect.Type[] r1 = r1.getUpperBounds()
            r0 = 0
            r1 = r1[r0]
        Ld:
            boolean r0 = r3.isAssignableFrom(r2)
            p185k7.C3828h5.m8587b(r0)
            java.lang.reflect.Type r3 = m9548d(r1, r2, r3)
            java.lang.reflect.Type r1 = m9551g(r1, r2, r3)
            return r1
    }

    /* renamed from: g */
    public static java.lang.reflect.Type m9551g(java.lang.reflect.Type r1, java.lang.Class<?> r2, java.lang.reflect.Type r3) {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.lang.reflect.Type r1 = m9552h(r1, r2, r3, r0)
            return r1
    }

    /* renamed from: h */
    public static java.lang.reflect.Type m9552h(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10, java.util.Collection<java.lang.reflect.TypeVariable> r11) {
        L0:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            r1 = 0
            if (r0 == 0) goto L4e
            r0 = r10
            java.lang.reflect.TypeVariable r0 = (java.lang.reflect.TypeVariable) r0
            boolean r2 = r11.contains(r0)
            if (r2 == 0) goto Lf
            return r10
        Lf:
            r11.add(r0)
            java.lang.reflect.GenericDeclaration r10 = r0.getGenericDeclaration()
            boolean r2 = r10 instanceof java.lang.Class
            if (r2 == 0) goto L1d
            java.lang.Class r10 = (java.lang.Class) r10
            goto L1e
        L1d:
            r10 = 0
        L1e:
            if (r10 != 0) goto L21
            goto L4a
        L21:
            java.lang.reflect.Type r2 = m9548d(r8, r9, r10)
            boolean r3 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L4a
            java.lang.reflect.TypeVariable[] r10 = r10.getTypeParameters()
            int r3 = r10.length
        L2e:
            if (r1 >= r3) goto L44
            r4 = r10[r1]
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L41
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            java.lang.reflect.Type[] r10 = r2.getActualTypeArguments()
            r10 = r10[r1]
            goto L4b
        L41:
            int r1 = r1 + 1
            goto L2e
        L44:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            r8.<init>()
            throw r8
        L4a:
            r10 = r0
        L4b:
            if (r10 != r0) goto L0
            return r10
        L4e:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L6c
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r2 = r0.isArray()
            if (r2 == 0) goto L6c
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = m9552h(r8, r9, r10, r11)
            if (r10 != r8) goto L66
            goto L6b
        L66:
            lb.a$a r0 = new lb.a$a
            r0.<init>(r8)
        L6b:
            return r0
        L6c:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L83
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = m9552h(r8, r9, r0, r11)
            if (r0 != r8) goto L7d
            goto L82
        L7d:
            lb.a$a r10 = new lb.a$a
            r10.<init>(r8)
        L82:
            return r10
        L83:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r2 = 1
            if (r0 == 0) goto Lc3
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = m9552h(r8, r9, r0, r11)
            if (r3 == r0) goto L96
            r0 = 1
            goto L97
        L96:
            r0 = 0
        L97:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L9c:
            if (r1 >= r5) goto Lb7
            r6 = r4[r1]
            java.lang.reflect.Type r6 = m9552h(r8, r9, r6, r11)
            r7 = r4[r1]
            if (r6 == r7) goto Lb4
            if (r0 != 0) goto Lb2
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = 1
        Lb2:
            r4[r1] = r6
        Lb4:
            int r1 = r1 + 1
            goto L9c
        Lb7:
            if (r0 == 0) goto Lc2
            java.lang.reflect.Type r8 = r10.getRawType()
            lb.a$b r10 = new lb.a$b
            r10.<init>(r3, r8, r4)
        Lc2:
            return r10
        Lc3:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L121
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r2) goto Lfa
            r3 = r0[r1]
            java.lang.reflect.Type r8 = m9552h(r8, r9, r3, r11)
            r9 = r0[r1]
            if (r8 == r9) goto L121
            boolean r9 = r8 instanceof java.lang.reflect.WildcardType
            if (r9 == 0) goto Le9
            java.lang.reflect.WildcardType r8 = (java.lang.reflect.WildcardType) r8
            java.lang.reflect.Type[] r8 = r8.getLowerBounds()
            goto Lee
        Le9:
            java.lang.reflect.Type[] r9 = new java.lang.reflect.Type[r2]
            r9[r1] = r8
            r8 = r9
        Lee:
            lb.a$c r9 = new lb.a$c
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r2]
            java.lang.Class<java.lang.Object> r11 = java.lang.Object.class
            r10[r1] = r11
            r9.<init>(r10, r8)
            return r9
        Lfa:
            int r0 = r3.length
            if (r0 != r2) goto L121
            r0 = r3[r1]
            java.lang.reflect.Type r8 = m9552h(r8, r9, r0, r11)     // Catch: java.lang.Throwable -> L11f
            r9 = r3[r1]
            if (r8 == r9) goto L121
            boolean r9 = r8 instanceof java.lang.reflect.WildcardType
            if (r9 == 0) goto L112
            java.lang.reflect.WildcardType r8 = (java.lang.reflect.WildcardType) r8
            java.lang.reflect.Type[] r8 = r8.getUpperBounds()
            goto L117
        L112:
            java.lang.reflect.Type[] r9 = new java.lang.reflect.Type[r2]
            r9[r1] = r8
            r8 = r9
        L117:
            lb.a$c r9 = new lb.a$c
            java.lang.reflect.Type[] r10 = lb.C4238a.f17407a
            r9.<init>(r8, r10)
            return r9
        L11f:
            r8 = move-exception
            throw r8
        L121:
            return r10
    }

    /* renamed from: i */
    public static java.lang.String m9553i(java.lang.reflect.Type r1) {
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
