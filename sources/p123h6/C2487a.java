package p123h6;

/* renamed from: h6.a */
/* loaded from: classes.dex */
public final class C2487a {

    /* renamed from: a */
    public static final java.util.regex.Pattern f11248a = null;

    /* renamed from: b */
    public static final java.util.Random f11249b = null;

    static {
            java.lang.String r0 = "urn:x-cast:[-A-Za-z0-9_]+(\\.[-A-Za-z0-9_]+)*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            p123h6.C2487a.f11248a = r0
            java.util.Random r0 = new java.util.Random
            long r1 = android.os.SystemClock.elapsedRealtime()
            r0.<init>(r1)
            p123h6.C2487a.f11249b = r0
            return
    }

    @androidx.annotation.RecentlyNullable
    /* renamed from: a */
    public static org.json.JSONObject m6362a(java.lang.String r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> La
            r1.<init>(r2)     // Catch: org.json.JSONException -> La
            return r1
        La:
            return r0
    }

    /* renamed from: b */
    public static double m6363b(long r2) {
            double r2 = (double) r2
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 / r0
            return r2
    }

    @androidx.annotation.RecentlyNullable
    /* renamed from: c */
    public static java.lang.String m6364c(@androidx.annotation.RecentlyNonNull org.json.JSONObject r1, @androidx.annotation.RecentlyNonNull java.lang.String r2) {
            boolean r0 = r1.has(r2)
            if (r0 == 0) goto Lb
            java.lang.String r1 = r1.optString(r2)
            return r1
        Lb:
            r1 = 0
            return r1
    }

    /* renamed from: d */
    public static long m6365d(double r2) {
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 * r0
            long r2 = (long) r2
            return r2
    }

    /* renamed from: e */
    public static void m6366e(@androidx.annotation.RecentlyNonNull java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L37
            int r0 = r2.length()
            r1 = 128(0x80, float:1.8E-43)
            if (r0 > r1) goto L2f
            java.lang.String r0 = "urn:x-cast:"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L27
            int r2 = r2.length()
            r0 = 11
            if (r2 == r0) goto L1f
            return
        L1f:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Namespace must begin with the prefix \"urn:x-cast:\" and have non-empty suffix"
            r2.<init>(r0)
            throw r2
        L27:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Namespace must begin with the prefix \"urn:x-cast:\""
            r2.<init>(r0)
            throw r2
        L2f:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid namespace length"
            r2.<init>(r0)
            throw r2
        L37:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Namespace cannot be null or empty"
            r2.<init>(r0)
            throw r2
    }

    @androidx.annotation.RecentlyNonNull
    /* renamed from: f */
    public static java.util.List<java.lang.Integer> m6367f(@androidx.annotation.RecentlyNonNull int[] r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r4.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L15
            r3 = r4[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r3)
            int r2 = r2 + 1
            goto L7
        L15:
            return r0
    }

    /* renamed from: g */
    public static <T> boolean m6368g(@androidx.annotation.RecentlyNonNull T r2, @androidx.annotation.RecentlyNonNull T r3) {
            r0 = 1
            r1 = 0
            if (r2 != 0) goto L6
            if (r3 == 0) goto L13
        L6:
            if (r2 == 0) goto L12
            if (r3 == 0) goto L12
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L11
            goto L13
        L11:
            return r1
        L12:
            r0 = 0
        L13:
            return r0
    }

    @androidx.annotation.RecentlyNonNull
    /* renamed from: h */
    public static int[] m6369h(@androidx.annotation.RecentlyNonNull java.util.Collection<java.lang.Integer> r4) {
            int r0 = r4.size()
            int[] r0 = new int[r0]
            java.util.Iterator r4 = r4.iterator()
            r1 = 0
        Lb:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L21
            int r2 = r1 + 1
            java.lang.Object r3 = r4.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0[r1] = r3
            r1 = r2
            goto Lb
        L21:
            return r0
    }
}
