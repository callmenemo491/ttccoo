package androidx.lifecycle;

/* renamed from: androidx.lifecycle.l0 */
/* loaded from: classes.dex */
public final class C0453l0 {

    /* renamed from: e */
    public static final java.lang.Class[] f2533e = null;

    /* renamed from: a */
    public final java.util.Map<java.lang.String, java.lang.Object> f2534a;

    /* renamed from: b */
    public final java.util.Map<java.lang.String, androidx.savedstate.C0620a.b> f2535b;

    /* renamed from: c */
    public final java.util.Map<java.lang.String, java.lang.Object> f2536c;

    /* renamed from: d */
    public final androidx.savedstate.C0620a.b f2537d;

    /* renamed from: androidx.lifecycle.l0$a */
    public class a implements androidx.savedstate.C0620a.b {

        /* renamed from: a */
        public final /* synthetic */ androidx.lifecycle.C0453l0 f2538a;

        public a(androidx.lifecycle.C0453l0 r1) {
                r0 = this;
                r0.f2538a = r1
                r0.<init>()
                return
        }

        @Override // androidx.savedstate.C0620a.b
        /* renamed from: a */
        public android.os.Bundle mo1350a() {
                r8 = this;
                java.util.HashMap r0 = new java.util.HashMap
                androidx.lifecycle.l0 r1 = r8.f2538a
                java.util.Map<java.lang.String, androidx.savedstate.a$b> r1 = r1.f2535b
                r0.<init>(r1)
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L11:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L76
                java.lang.Object r1 = r0.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getValue()
                androidx.savedstate.a$b r2 = (androidx.savedstate.C0620a.b) r2
                android.os.Bundle r2 = r2.mo1350a()
                androidx.lifecycle.l0 r3 = r8.f2538a
                java.lang.Object r1 = r1.getKey()
                java.lang.String r1 = (java.lang.String) r1
                java.util.Objects.requireNonNull(r3)
                if (r2 != 0) goto L35
                goto L43
            L35:
                java.lang.Class[] r4 = androidx.lifecycle.C0453l0.f2533e
                int r5 = r4.length
                r6 = 0
            L39:
                if (r6 >= r5) goto L5a
                r7 = r4[r6]
                boolean r7 = r7.isInstance(r2)
                if (r7 == 0) goto L57
            L43:
                java.util.Map<java.lang.String, java.lang.Object> r4 = r3.f2536c
                java.lang.Object r4 = r4.get(r1)
                androidx.lifecycle.d0 r4 = (androidx.lifecycle.C0437d0) r4
                if (r4 == 0) goto L51
                r4.mo7l(r2)
                goto L11
            L51:
                java.util.Map<java.lang.String, java.lang.Object> r3 = r3.f2534a
                r3.put(r1, r2)
                goto L11
            L57:
                int r6 = r6 + 1
                goto L39
            L5a:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Can't put value with type "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                java.lang.Class r2 = r2.getClass()
                r1.append(r2)
                java.lang.String r2 = " into saved state"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L76:
                androidx.lifecycle.l0 r0 = r8.f2538a
                java.util.Map<java.lang.String, java.lang.Object> r0 = r0.f2534a
                java.util.Set r0 = r0.keySet()
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                r1.<init>(r2)
                java.util.ArrayList r2 = new java.util.ArrayList
                int r3 = r1.size()
                r2.<init>(r3)
                java.util.Iterator r0 = r0.iterator()
            L94:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto Laf
                java.lang.Object r3 = r0.next()
                java.lang.String r3 = (java.lang.String) r3
                r1.add(r3)
                androidx.lifecycle.l0 r4 = r8.f2538a
                java.util.Map<java.lang.String, java.lang.Object> r4 = r4.f2534a
                java.lang.Object r3 = r4.get(r3)
                r2.add(r3)
                goto L94
            Laf:
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r3 = "keys"
                r0.putParcelableArrayList(r3, r1)
                java.lang.String r1 = "values"
                r0.putParcelableArrayList(r1, r2)
                return r0
        }
    }

    static {
            r0 = 29
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r2 = 0
            r0[r2] = r1
            r1 = 1
            java.lang.Class<boolean[]> r2 = boolean[].class
            r0[r1] = r2
            java.lang.Class r1 = java.lang.Double.TYPE
            r2 = 2
            r0[r2] = r1
            r1 = 3
            java.lang.Class<double[]> r2 = double[].class
            r0[r1] = r2
            java.lang.Class r1 = java.lang.Integer.TYPE
            r2 = 4
            r0[r2] = r1
            r1 = 5
            java.lang.Class<int[]> r2 = int[].class
            r0[r1] = r2
            java.lang.Class r1 = java.lang.Long.TYPE
            r2 = 6
            r0[r2] = r1
            r1 = 7
            java.lang.Class<long[]> r2 = long[].class
            r0[r1] = r2
            r1 = 8
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r0[r1] = r2
            r1 = 9
            java.lang.Class<java.lang.String[]> r2 = java.lang.String[].class
            r0[r1] = r2
            r1 = 10
            java.lang.Class<android.os.Binder> r2 = android.os.Binder.class
            r0[r1] = r2
            r1 = 11
            java.lang.Class<android.os.Bundle> r2 = android.os.Bundle.class
            r0[r1] = r2
            java.lang.Class r1 = java.lang.Byte.TYPE
            r2 = 12
            r0[r2] = r1
            r1 = 13
            java.lang.Class<byte[]> r2 = byte[].class
            r0[r1] = r2
            java.lang.Class r1 = java.lang.Character.TYPE
            r2 = 14
            r0[r2] = r1
            r1 = 15
            java.lang.Class<char[]> r2 = char[].class
            r0[r1] = r2
            r1 = 16
            java.lang.Class<java.lang.CharSequence> r2 = java.lang.CharSequence.class
            r0[r1] = r2
            r1 = 17
            java.lang.Class<java.lang.CharSequence[]> r2 = java.lang.CharSequence[].class
            r0[r1] = r2
            r1 = 18
            java.lang.Class<java.util.ArrayList> r2 = java.util.ArrayList.class
            r0[r1] = r2
            java.lang.Class r1 = java.lang.Float.TYPE
            r2 = 19
            r0[r2] = r1
            r1 = 20
            java.lang.Class<float[]> r2 = float[].class
            r0[r1] = r2
            r1 = 21
            java.lang.Class<android.os.Parcelable> r2 = android.os.Parcelable.class
            r0[r1] = r2
            r1 = 22
            java.lang.Class<android.os.Parcelable[]> r2 = android.os.Parcelable[].class
            r0[r1] = r2
            r1 = 23
            java.lang.Class<java.io.Serializable> r2 = java.io.Serializable.class
            r0[r1] = r2
            java.lang.Class r1 = java.lang.Short.TYPE
            r2 = 24
            r0[r2] = r1
            r1 = 25
            java.lang.Class<short[]> r2 = short[].class
            r0[r1] = r2
            r1 = 26
            java.lang.Class<android.util.SparseArray> r2 = android.util.SparseArray.class
            r0[r1] = r2
            java.lang.Class<android.util.Size> r1 = android.util.Size.class
            r2 = 27
            r0[r2] = r1
            r1 = 28
            java.lang.Class<android.util.SizeF> r2 = android.util.SizeF.class
            r0[r1] = r2
            androidx.lifecycle.C0453l0.f2533e = r0
            return
    }

    public C0453l0() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f2535b = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f2536c = r0
            androidx.lifecycle.l0$a r0 = new androidx.lifecycle.l0$a
            r0.<init>(r1)
            r1.f2537d = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f2534a = r0
            return
    }

    public C0453l0(java.util.Map<java.lang.String, java.lang.Object> r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f2535b = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f2536c = r0
            androidx.lifecycle.l0$a r0 = new androidx.lifecycle.l0$a
            r0.<init>(r1)
            r1.f2537d = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r2)
            r1.f2534a = r0
            return
    }
}
