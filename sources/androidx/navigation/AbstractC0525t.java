package androidx.navigation;

/* renamed from: androidx.navigation.t */
/* loaded from: classes.dex */
public abstract class AbstractC0525t<T> {

    /* renamed from: b */
    public static final androidx.navigation.AbstractC0525t<java.lang.Integer> f3001b = null;

    /* renamed from: c */
    public static final androidx.navigation.AbstractC0525t<java.lang.Integer> f3002c = null;

    /* renamed from: d */
    public static final androidx.navigation.AbstractC0525t<int[]> f3003d = null;

    /* renamed from: e */
    public static final androidx.navigation.AbstractC0525t<java.lang.Long> f3004e = null;

    /* renamed from: f */
    public static final androidx.navigation.AbstractC0525t<long[]> f3005f = null;

    /* renamed from: g */
    public static final androidx.navigation.AbstractC0525t<java.lang.Float> f3006g = null;

    /* renamed from: h */
    public static final androidx.navigation.AbstractC0525t<float[]> f3007h = null;

    /* renamed from: i */
    public static final androidx.navigation.AbstractC0525t<java.lang.Boolean> f3008i = null;

    /* renamed from: j */
    public static final androidx.navigation.AbstractC0525t<boolean[]> f3009j = null;

    /* renamed from: k */
    public static final androidx.navigation.AbstractC0525t<java.lang.String> f3010k = null;

    /* renamed from: l */
    public static final androidx.navigation.AbstractC0525t<java.lang.String[]> f3011l = null;

    /* renamed from: a */
    public final boolean f3012a;

    /* renamed from: androidx.navigation.t$a */
    public class a extends androidx.navigation.AbstractC0525t<java.lang.String> {
        public a(boolean r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: a */
        public java.lang.String mo1603a(android.os.Bundle r1, java.lang.String r2) {
                r0 = this;
                java.lang.Object r1 = r1.get(r2)
                java.lang.String r1 = (java.lang.String) r1
                return r1
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: b */
        public java.lang.String mo1604b() {
                r1 = this;
                java.lang.String r0 = "string"
                return r0
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: c */
        public java.lang.String mo1605c(java.lang.String r1) {
                r0 = this;
                return r1
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: d */
        public void mo1606d(android.os.Bundle r1, java.lang.String r2, java.lang.String r3) {
                r0 = this;
                java.lang.String r3 = (java.lang.String) r3
                r1.putString(r2, r3)
                return
        }
    }

    /* renamed from: androidx.navigation.t$b */
    public class b extends androidx.navigation.AbstractC0525t<java.lang.String[]> {
        public b(boolean r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: a */
        public java.lang.String[] mo1603a(android.os.Bundle r1, java.lang.String r2) {
                r0 = this;
                java.lang.Object r1 = r1.get(r2)
                java.lang.String[] r1 = (java.lang.String[]) r1
                return r1
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: b */
        public java.lang.String mo1604b() {
                r1 = this;
                java.lang.String r0 = "string[]"
                return r0
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: c */
        public java.lang.String[] mo1605c(java.lang.String r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Arrays don't support default values."
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: d */
        public void mo1606d(android.os.Bundle r1, java.lang.String r2, java.lang.String[] r3) {
                r0 = this;
                java.lang.String[] r3 = (java.lang.String[]) r3
                r1.putStringArray(r2, r3)
                return
        }
    }

    /* renamed from: androidx.navigation.t$c */
    public class c extends androidx.navigation.AbstractC0525t<java.lang.Integer> {
        public c(boolean r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: a */
        public java.lang.Integer mo1603a(android.os.Bundle r1, java.lang.String r2) {
                r0 = this;
                java.lang.Object r1 = r1.get(r2)
                java.lang.Integer r1 = (java.lang.Integer) r1
                return r1
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: b */
        public java.lang.String mo1604b() {
                r1 = this;
                java.lang.String r0 = "integer"
                return r0
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: c */
        public java.lang.Integer mo1605c(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "0x"
                boolean r0 = r2.startsWith(r0)
                if (r0 == 0) goto L14
                r0 = 2
                java.lang.String r2 = r2.substring(r0)
                r0 = 16
                int r2 = java.lang.Integer.parseInt(r2, r0)
                goto L18
            L14:
                int r2 = java.lang.Integer.parseInt(r2)
            L18:
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                return r2
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: d */
        public void mo1606d(android.os.Bundle r1, java.lang.String r2, java.lang.Integer r3) {
                r0 = this;
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                r1.putInt(r2, r3)
                return
        }
    }

    /* renamed from: androidx.navigation.t$d */
    public class d extends androidx.navigation.AbstractC0525t<java.lang.Integer> {
        public d(boolean r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: a */
        public java.lang.Integer mo1603a(android.os.Bundle r1, java.lang.String r2) {
                r0 = this;
                java.lang.Object r1 = r1.get(r2)
                java.lang.Integer r1 = (java.lang.Integer) r1
                return r1
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: b */
        public java.lang.String mo1604b() {
                r1 = this;
                java.lang.String r0 = "reference"
                return r0
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: c */
        public java.lang.Integer mo1605c(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "0x"
                boolean r0 = r2.startsWith(r0)
                if (r0 == 0) goto L14
                r0 = 2
                java.lang.String r2 = r2.substring(r0)
                r0 = 16
                int r2 = java.lang.Integer.parseInt(r2, r0)
                goto L18
            L14:
                int r2 = java.lang.Integer.parseInt(r2)
            L18:
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                return r2
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: d */
        public void mo1606d(android.os.Bundle r1, java.lang.String r2, java.lang.Integer r3) {
                r0 = this;
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                r1.putInt(r2, r3)
                return
        }
    }

    /* renamed from: androidx.navigation.t$e */
    public class e extends androidx.navigation.AbstractC0525t<int[]> {
        public e(boolean r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: a */
        public int[] mo1603a(android.os.Bundle r1, java.lang.String r2) {
                r0 = this;
                java.lang.Object r1 = r1.get(r2)
                int[] r1 = (int[]) r1
                return r1
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: b */
        public java.lang.String mo1604b() {
                r1 = this;
                java.lang.String r0 = "integer[]"
                return r0
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: c */
        public int[] mo1605c(java.lang.String r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Arrays don't support default values."
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: d */
        public void mo1606d(android.os.Bundle r1, java.lang.String r2, int[] r3) {
                r0 = this;
                int[] r3 = (int[]) r3
                r1.putIntArray(r2, r3)
                return
        }
    }

    /* renamed from: androidx.navigation.t$f */
    public class f extends androidx.navigation.AbstractC0525t<java.lang.Long> {
        public f(boolean r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: a */
        public java.lang.Long mo1603a(android.os.Bundle r1, java.lang.String r2) {
                r0 = this;
                java.lang.Object r1 = r1.get(r2)
                java.lang.Long r1 = (java.lang.Long) r1
                return r1
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: b */
        public java.lang.String mo1604b() {
                r1 = this;
                java.lang.String r0 = "long"
                return r0
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: c */
        public java.lang.Long mo1605c(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "L"
                boolean r0 = r3.endsWith(r0)
                if (r0 == 0) goto L13
                r0 = 0
                int r1 = r3.length()
                int r1 = r1 + (-1)
                java.lang.String r3 = r3.substring(r0, r1)
            L13:
                java.lang.String r0 = "0x"
                boolean r0 = r3.startsWith(r0)
                if (r0 == 0) goto L27
                r0 = 2
                java.lang.String r3 = r3.substring(r0)
                r0 = 16
                long r0 = java.lang.Long.parseLong(r3, r0)
                goto L2b
            L27:
                long r0 = java.lang.Long.parseLong(r3)
            L2b:
                java.lang.Long r3 = java.lang.Long.valueOf(r0)
                return r3
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: d */
        public void mo1606d(android.os.Bundle r3, java.lang.String r4, java.lang.Long r5) {
                r2 = this;
                java.lang.Long r5 = (java.lang.Long) r5
                long r0 = r5.longValue()
                r3.putLong(r4, r0)
                return
        }
    }

    /* renamed from: androidx.navigation.t$g */
    public class g extends androidx.navigation.AbstractC0525t<long[]> {
        public g(boolean r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: a */
        public long[] mo1603a(android.os.Bundle r1, java.lang.String r2) {
                r0 = this;
                java.lang.Object r1 = r1.get(r2)
                long[] r1 = (long[]) r1
                return r1
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: b */
        public java.lang.String mo1604b() {
                r1 = this;
                java.lang.String r0 = "long[]"
                return r0
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: c */
        public long[] mo1605c(java.lang.String r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Arrays don't support default values."
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: d */
        public void mo1606d(android.os.Bundle r1, java.lang.String r2, long[] r3) {
                r0 = this;
                long[] r3 = (long[]) r3
                r1.putLongArray(r2, r3)
                return
        }
    }

    /* renamed from: androidx.navigation.t$h */
    public class h extends androidx.navigation.AbstractC0525t<java.lang.Float> {
        public h(boolean r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: a */
        public java.lang.Float mo1603a(android.os.Bundle r1, java.lang.String r2) {
                r0 = this;
                java.lang.Object r1 = r1.get(r2)
                java.lang.Float r1 = (java.lang.Float) r1
                return r1
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: b */
        public java.lang.String mo1604b() {
                r1 = this;
                java.lang.String r0 = "float"
                return r0
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: c */
        public java.lang.Float mo1605c(java.lang.String r1) {
                r0 = this;
                float r1 = java.lang.Float.parseFloat(r1)
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                return r1
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: d */
        public void mo1606d(android.os.Bundle r1, java.lang.String r2, java.lang.Float r3) {
                r0 = this;
                java.lang.Float r3 = (java.lang.Float) r3
                float r3 = r3.floatValue()
                r1.putFloat(r2, r3)
                return
        }
    }

    /* renamed from: androidx.navigation.t$i */
    public class i extends androidx.navigation.AbstractC0525t<float[]> {
        public i(boolean r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: a */
        public float[] mo1603a(android.os.Bundle r1, java.lang.String r2) {
                r0 = this;
                java.lang.Object r1 = r1.get(r2)
                float[] r1 = (float[]) r1
                return r1
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: b */
        public java.lang.String mo1604b() {
                r1 = this;
                java.lang.String r0 = "float[]"
                return r0
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: c */
        public float[] mo1605c(java.lang.String r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Arrays don't support default values."
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: d */
        public void mo1606d(android.os.Bundle r1, java.lang.String r2, float[] r3) {
                r0 = this;
                float[] r3 = (float[]) r3
                r1.putFloatArray(r2, r3)
                return
        }
    }

    /* renamed from: androidx.navigation.t$j */
    public class j extends androidx.navigation.AbstractC0525t<java.lang.Boolean> {
        public j(boolean r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: a */
        public java.lang.Boolean mo1603a(android.os.Bundle r1, java.lang.String r2) {
                r0 = this;
                java.lang.Object r1 = r1.get(r2)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                return r1
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: b */
        public java.lang.String mo1604b() {
                r1 = this;
                java.lang.String r0 = "boolean"
                return r0
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: c */
        public java.lang.Boolean mo1605c(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "true"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto Lb
                java.lang.Boolean r2 = java.lang.Boolean.TRUE
                goto L15
            Lb:
                java.lang.String r0 = "false"
                boolean r2 = r0.equals(r2)
                if (r2 == 0) goto L16
                java.lang.Boolean r2 = java.lang.Boolean.FALSE
            L15:
                return r2
            L16:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "A boolean NavType only accepts \"true\" or \"false\" values."
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: d */
        public void mo1606d(android.os.Bundle r1, java.lang.String r2, java.lang.Boolean r3) {
                r0 = this;
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                boolean r3 = r3.booleanValue()
                r1.putBoolean(r2, r3)
                return
        }
    }

    /* renamed from: androidx.navigation.t$k */
    public class k extends androidx.navigation.AbstractC0525t<boolean[]> {
        public k(boolean r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: a */
        public boolean[] mo1603a(android.os.Bundle r1, java.lang.String r2) {
                r0 = this;
                java.lang.Object r1 = r1.get(r2)
                boolean[] r1 = (boolean[]) r1
                return r1
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: b */
        public java.lang.String mo1604b() {
                r1 = this;
                java.lang.String r0 = "boolean[]"
                return r0
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: c */
        public boolean[] mo1605c(java.lang.String r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Arrays don't support default values."
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: d */
        public void mo1606d(android.os.Bundle r1, java.lang.String r2, boolean[] r3) {
                r0 = this;
                boolean[] r3 = (boolean[]) r3
                r1.putBooleanArray(r2, r3)
                return
        }
    }

    /* renamed from: androidx.navigation.t$l */
    public static final class l<D extends java.lang.Enum> extends androidx.navigation.AbstractC0525t.p<D> {

        /* renamed from: n */
        public final java.lang.Class<D> f3013n;

        public l(java.lang.Class<D> r3) {
                r2 = this;
                r0 = 0
                r2.<init>(r0, r3)
                boolean r0 = r3.isEnum()
                if (r0 == 0) goto Ld
                r2.f3013n = r3
                return
            Ld:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " is not an Enum type."
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
        }

        @Override // androidx.navigation.AbstractC0525t.p, androidx.navigation.AbstractC0525t
        /* renamed from: b */
        public java.lang.String mo1604b() {
                r1 = this;
                java.lang.Class<D extends java.lang.Enum> r0 = r1.f3013n
                java.lang.String r0 = r0.getName()
                return r0
        }

        @Override // androidx.navigation.AbstractC0525t.p, androidx.navigation.AbstractC0525t
        /* renamed from: c */
        public /* bridge */ /* synthetic */ java.lang.Object mo1605c(java.lang.String r1) {
                r0 = this;
                java.lang.Enum r1 = r0.m1608f(r1)
                return r1
        }

        @Override // androidx.navigation.AbstractC0525t.p
        /* renamed from: e */
        public /* bridge */ /* synthetic */ java.io.Serializable mo1607e(java.lang.String r1) {
                r0 = this;
                java.lang.Enum r1 = r0.m1608f(r1)
                return r1
        }

        /* renamed from: f */
        public D m1608f(java.lang.String r6) {
                r5 = this;
                java.lang.Class<D extends java.lang.Enum> r0 = r5.f3013n
                java.lang.Object[] r0 = r0.getEnumConstants()
                java.lang.Enum[] r0 = (java.lang.Enum[]) r0
                int r1 = r0.length
                r2 = 0
            La:
                if (r2 >= r1) goto L1c
                r3 = r0[r2]
                java.lang.String r4 = r3.name()
                boolean r4 = r4.equals(r6)
                if (r4 == 0) goto L19
                return r3
            L19:
                int r2 = r2 + 1
                goto La
            L1c:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Enum value "
                java.lang.String r2 = " not found for type "
                java.lang.StringBuilder r6 = androidx.activity.result.C0196d.m449a(r1, r6, r2)
                java.lang.Class<D extends java.lang.Enum> r1 = r5.f3013n
                java.lang.String r1 = r1.getName()
                r6.append(r1)
                java.lang.String r1 = "."
                r6.append(r1)
                java.lang.String r6 = r6.toString()
                r0.<init>(r6)
                throw r0
        }
    }

    /* renamed from: androidx.navigation.t$m */
    public static final class m<D extends android.os.Parcelable> extends androidx.navigation.AbstractC0525t<D[]> {

        /* renamed from: m */
        public final java.lang.Class<D[]> f3014m;

        public m(java.lang.Class<D> r3) {
                r2 = this;
                r0 = 1
                r2.<init>(r0)
                java.lang.Class<android.os.Parcelable> r0 = android.os.Parcelable.class
                boolean r0 = r0.isAssignableFrom(r3)
                if (r0 == 0) goto L34
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> L2d
                r0.<init>()     // Catch: java.lang.ClassNotFoundException -> L2d
                java.lang.String r1 = "[L"
                r0.append(r1)     // Catch: java.lang.ClassNotFoundException -> L2d
                java.lang.String r3 = r3.getName()     // Catch: java.lang.ClassNotFoundException -> L2d
                r0.append(r3)     // Catch: java.lang.ClassNotFoundException -> L2d
                java.lang.String r3 = ";"
                r0.append(r3)     // Catch: java.lang.ClassNotFoundException -> L2d
                java.lang.String r3 = r0.toString()     // Catch: java.lang.ClassNotFoundException -> L2d
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L2d
                r2.f3014m = r3
                return
            L2d:
                r3 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r0.<init>(r3)
                throw r0
            L34:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " does not implement Parcelable."
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: a */
        public java.lang.Object mo1603a(android.os.Bundle r1, java.lang.String r2) {
                r0 = this;
                java.lang.Object r1 = r1.get(r2)
                android.os.Parcelable[] r1 = (android.os.Parcelable[]) r1
                return r1
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: b */
        public java.lang.String mo1604b() {
                r1 = this;
                java.lang.Class<D extends android.os.Parcelable[]> r0 = r1.f3014m
                java.lang.String r0 = r0.getName()
                return r0
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: c */
        public java.lang.Object mo1605c(java.lang.String r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Arrays don't support default values."
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: d */
        public void mo1606d(android.os.Bundle r2, java.lang.String r3, java.lang.Object r4) {
                r1 = this;
                android.os.Parcelable[] r4 = (android.os.Parcelable[]) r4
                java.lang.Class<D extends android.os.Parcelable[]> r0 = r1.f3014m
                r0.cast(r4)
                r2.putParcelableArray(r3, r4)
                return
        }

        public boolean equals(java.lang.Object r3) {
                r2 = this;
                if (r2 != r3) goto L4
                r3 = 1
                return r3
            L4:
                if (r3 == 0) goto L1a
                java.lang.Class<androidx.navigation.t$m> r0 = androidx.navigation.AbstractC0525t.m.class
                java.lang.Class r1 = r3.getClass()
                if (r0 == r1) goto Lf
                goto L1a
            Lf:
                androidx.navigation.t$m r3 = (androidx.navigation.AbstractC0525t.m) r3
                java.lang.Class<D extends android.os.Parcelable[]> r0 = r2.f3014m
                java.lang.Class<D extends android.os.Parcelable[]> r3 = r3.f3014m
                boolean r3 = r0.equals(r3)
                return r3
            L1a:
                r3 = 0
                return r3
        }

        public int hashCode() {
                r1 = this;
                java.lang.Class<D extends android.os.Parcelable[]> r0 = r1.f3014m
                int r0 = r0.hashCode()
                return r0
        }
    }

    /* renamed from: androidx.navigation.t$n */
    public static final class n<D> extends androidx.navigation.AbstractC0525t<D> {

        /* renamed from: m */
        public final java.lang.Class<D> f3015m;

        public n(java.lang.Class<D> r3) {
                r2 = this;
                r0 = 1
                r2.<init>(r0)
                java.lang.Class<android.os.Parcelable> r0 = android.os.Parcelable.class
                boolean r0 = r0.isAssignableFrom(r3)
                if (r0 != 0) goto L2c
                java.lang.Class<java.io.Serializable> r0 = java.io.Serializable.class
                boolean r0 = r0.isAssignableFrom(r3)
                if (r0 == 0) goto L15
                goto L2c
            L15:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " does not implement Parcelable or Serializable."
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
            L2c:
                r2.f3015m = r3
                return
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: a */
        public D mo1603a(android.os.Bundle r1, java.lang.String r2) {
                r0 = this;
                java.lang.Object r1 = r1.get(r2)
                return r1
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: b */
        public java.lang.String mo1604b() {
                r1 = this;
                java.lang.Class<D> r0 = r1.f3015m
                java.lang.String r0 = r0.getName()
                return r0
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: c */
        public D mo1605c(java.lang.String r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Parcelables don't support default values."
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: d */
        public void mo1606d(android.os.Bundle r2, java.lang.String r3, D r4) {
                r1 = this;
                java.lang.Class<D> r0 = r1.f3015m
                r0.cast(r4)
                if (r4 == 0) goto L16
                boolean r0 = r4 instanceof android.os.Parcelable
                if (r0 == 0) goto Lc
                goto L16
            Lc:
                boolean r0 = r4 instanceof java.io.Serializable
                if (r0 == 0) goto L1b
                java.io.Serializable r4 = (java.io.Serializable) r4
                r2.putSerializable(r3, r4)
                goto L1b
            L16:
                android.os.Parcelable r4 = (android.os.Parcelable) r4
                r2.putParcelable(r3, r4)
            L1b:
                return
        }

        public boolean equals(java.lang.Object r3) {
                r2 = this;
                if (r2 != r3) goto L4
                r3 = 1
                return r3
            L4:
                if (r3 == 0) goto L1a
                java.lang.Class<androidx.navigation.t$n> r0 = androidx.navigation.AbstractC0525t.n.class
                java.lang.Class r1 = r3.getClass()
                if (r0 == r1) goto Lf
                goto L1a
            Lf:
                androidx.navigation.t$n r3 = (androidx.navigation.AbstractC0525t.n) r3
                java.lang.Class<D> r0 = r2.f3015m
                java.lang.Class<D> r3 = r3.f3015m
                boolean r3 = r0.equals(r3)
                return r3
            L1a:
                r3 = 0
                return r3
        }

        public int hashCode() {
                r1 = this;
                java.lang.Class<D> r0 = r1.f3015m
                int r0 = r0.hashCode()
                return r0
        }
    }

    /* renamed from: androidx.navigation.t$o */
    public static final class o<D extends java.io.Serializable> extends androidx.navigation.AbstractC0525t<D[]> {

        /* renamed from: m */
        public final java.lang.Class<D[]> f3016m;

        public o(java.lang.Class<D> r3) {
                r2 = this;
                r0 = 1
                r2.<init>(r0)
                java.lang.Class<java.io.Serializable> r0 = java.io.Serializable.class
                boolean r0 = r0.isAssignableFrom(r3)
                if (r0 == 0) goto L34
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> L2d
                r0.<init>()     // Catch: java.lang.ClassNotFoundException -> L2d
                java.lang.String r1 = "[L"
                r0.append(r1)     // Catch: java.lang.ClassNotFoundException -> L2d
                java.lang.String r3 = r3.getName()     // Catch: java.lang.ClassNotFoundException -> L2d
                r0.append(r3)     // Catch: java.lang.ClassNotFoundException -> L2d
                java.lang.String r3 = ";"
                r0.append(r3)     // Catch: java.lang.ClassNotFoundException -> L2d
                java.lang.String r3 = r0.toString()     // Catch: java.lang.ClassNotFoundException -> L2d
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L2d
                r2.f3016m = r3
                return
            L2d:
                r3 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r0.<init>(r3)
                throw r0
            L34:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " does not implement Serializable."
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: a */
        public java.lang.Object mo1603a(android.os.Bundle r1, java.lang.String r2) {
                r0 = this;
                java.lang.Object r1 = r1.get(r2)
                java.io.Serializable[] r1 = (java.io.Serializable[]) r1
                return r1
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: b */
        public java.lang.String mo1604b() {
                r1 = this;
                java.lang.Class<D extends java.io.Serializable[]> r0 = r1.f3016m
                java.lang.String r0 = r0.getName()
                return r0
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: c */
        public java.lang.Object mo1605c(java.lang.String r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Arrays don't support default values."
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: d */
        public void mo1606d(android.os.Bundle r2, java.lang.String r3, java.lang.Object r4) {
                r1 = this;
                java.io.Serializable[] r4 = (java.io.Serializable[]) r4
                java.lang.Class<D extends java.io.Serializable[]> r0 = r1.f3016m
                r0.cast(r4)
                r2.putSerializable(r3, r4)
                return
        }

        public boolean equals(java.lang.Object r3) {
                r2 = this;
                if (r2 != r3) goto L4
                r3 = 1
                return r3
            L4:
                if (r3 == 0) goto L1a
                java.lang.Class<androidx.navigation.t$o> r0 = androidx.navigation.AbstractC0525t.o.class
                java.lang.Class r1 = r3.getClass()
                if (r0 == r1) goto Lf
                goto L1a
            Lf:
                androidx.navigation.t$o r3 = (androidx.navigation.AbstractC0525t.o) r3
                java.lang.Class<D extends java.io.Serializable[]> r0 = r2.f3016m
                java.lang.Class<D extends java.io.Serializable[]> r3 = r3.f3016m
                boolean r3 = r0.equals(r3)
                return r3
            L1a:
                r3 = 0
                return r3
        }

        public int hashCode() {
                r1 = this;
                java.lang.Class<D extends java.io.Serializable[]> r0 = r1.f3016m
                int r0 = r0.hashCode()
                return r0
        }
    }

    /* renamed from: androidx.navigation.t$p */
    public static class p<D extends java.io.Serializable> extends androidx.navigation.AbstractC0525t<D> {

        /* renamed from: m */
        public final java.lang.Class<D> f3017m;

        public p(java.lang.Class<D> r3) {
                r2 = this;
                r0 = 1
                r2.<init>(r0)
                java.lang.Class<java.io.Serializable> r0 = java.io.Serializable.class
                boolean r0 = r0.isAssignableFrom(r3)
                if (r0 == 0) goto L2c
                boolean r0 = r3.isEnum()
                if (r0 != 0) goto L15
                r2.f3017m = r3
                return
            L15:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " is an Enum. You should use EnumType instead."
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
            L2c:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " does not implement Serializable."
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
        }

        public p(boolean r2, java.lang.Class<D> r3) {
                r1 = this;
                r1.<init>(r2)
                java.lang.Class<java.io.Serializable> r2 = java.io.Serializable.class
                boolean r2 = r2.isAssignableFrom(r3)
                if (r2 == 0) goto Le
                r1.f3017m = r3
                return
            Le:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r3)
                java.lang.String r3 = " does not implement Serializable."
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                throw r2
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: a */
        public java.lang.Object mo1603a(android.os.Bundle r1, java.lang.String r2) {
                r0 = this;
                java.lang.Object r1 = r1.get(r2)
                java.io.Serializable r1 = (java.io.Serializable) r1
                return r1
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: b */
        public java.lang.String mo1604b() {
                r1 = this;
                java.lang.Class<D extends java.io.Serializable> r0 = r1.f3017m
                java.lang.String r0 = r0.getName()
                return r0
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: c */
        public /* bridge */ /* synthetic */ java.lang.Object mo1605c(java.lang.String r1) {
                r0 = this;
                java.io.Serializable r1 = r0.mo1607e(r1)
                return r1
        }

        @Override // androidx.navigation.AbstractC0525t
        /* renamed from: d */
        public void mo1606d(android.os.Bundle r2, java.lang.String r3, java.lang.Object r4) {
                r1 = this;
                java.io.Serializable r4 = (java.io.Serializable) r4
                java.lang.Class<D extends java.io.Serializable> r0 = r1.f3017m
                r0.cast(r4)
                r2.putSerializable(r3, r4)
                return
        }

        /* renamed from: e */
        public D mo1607e(java.lang.String r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Serializables don't support default values."
                r2.<init>(r0)
                throw r2
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                if (r1 != r2) goto L4
                r2 = 1
                return r2
            L4:
                boolean r0 = r2 instanceof androidx.navigation.AbstractC0525t.p
                if (r0 != 0) goto La
                r2 = 0
                return r2
            La:
                androidx.navigation.t$p r2 = (androidx.navigation.AbstractC0525t.p) r2
                java.lang.Class<D extends java.io.Serializable> r0 = r1.f3017m
                java.lang.Class<D extends java.io.Serializable> r2 = r2.f3017m
                boolean r2 = r0.equals(r2)
                return r2
        }

        public int hashCode() {
                r1 = this;
                java.lang.Class<D extends java.io.Serializable> r0 = r1.f3017m
                int r0 = r0.hashCode()
                return r0
        }
    }

    static {
            androidx.navigation.t$c r0 = new androidx.navigation.t$c
            r1 = 0
            r0.<init>(r1)
            androidx.navigation.AbstractC0525t.f3001b = r0
            androidx.navigation.t$d r0 = new androidx.navigation.t$d
            r0.<init>(r1)
            androidx.navigation.AbstractC0525t.f3002c = r0
            androidx.navigation.t$e r0 = new androidx.navigation.t$e
            r2 = 1
            r0.<init>(r2)
            androidx.navigation.AbstractC0525t.f3003d = r0
            androidx.navigation.t$f r0 = new androidx.navigation.t$f
            r0.<init>(r1)
            androidx.navigation.AbstractC0525t.f3004e = r0
            androidx.navigation.t$g r0 = new androidx.navigation.t$g
            r0.<init>(r2)
            androidx.navigation.AbstractC0525t.f3005f = r0
            androidx.navigation.t$h r0 = new androidx.navigation.t$h
            r0.<init>(r1)
            androidx.navigation.AbstractC0525t.f3006g = r0
            androidx.navigation.t$i r0 = new androidx.navigation.t$i
            r0.<init>(r2)
            androidx.navigation.AbstractC0525t.f3007h = r0
            androidx.navigation.t$j r0 = new androidx.navigation.t$j
            r0.<init>(r1)
            androidx.navigation.AbstractC0525t.f3008i = r0
            androidx.navigation.t$k r0 = new androidx.navigation.t$k
            r0.<init>(r2)
            androidx.navigation.AbstractC0525t.f3009j = r0
            androidx.navigation.t$a r0 = new androidx.navigation.t$a
            r0.<init>(r2)
            androidx.navigation.AbstractC0525t.f3010k = r0
            androidx.navigation.t$b r0 = new androidx.navigation.t$b
            r0.<init>(r2)
            androidx.navigation.AbstractC0525t.f3011l = r0
            return
    }

    public AbstractC0525t(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.f3012a = r1
            return
    }

    /* renamed from: a */
    public abstract T mo1603a(android.os.Bundle r1, java.lang.String r2);

    /* renamed from: b */
    public abstract java.lang.String mo1604b();

    /* renamed from: c */
    public abstract T mo1605c(java.lang.String r1);

    /* renamed from: d */
    public abstract void mo1606d(android.os.Bundle r1, java.lang.String r2, T r3);

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.mo1604b()
            return r0
    }
}
