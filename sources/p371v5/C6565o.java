package p371v5;

/* renamed from: v5.o */
/* loaded from: classes.dex */
public final class C6565o {
    @org.checkerframework.dataflow.qual.Pure
    /* renamed from: a */
    public static java.lang.String m13368a(java.lang.String r3, java.lang.Throwable r4) {
            if (r4 != 0) goto L4
            r4 = 0
            goto L28
        L4:
            r0 = r4
        L5:
            if (r0 == 0) goto L12
            boolean r1 = r0 instanceof java.net.UnknownHostException
            if (r1 == 0) goto Ld
            r0 = 1
            goto L13
        Ld:
            java.lang.Throwable r0 = r0.getCause()
            goto L5
        L12:
            r0 = 0
        L13:
            if (r0 == 0) goto L18
            java.lang.String r4 = "UnknownHostException (no network)"
            goto L28
        L18:
            java.lang.String r4 = android.util.Log.getStackTraceString(r4)
            java.lang.String r4 = r4.trim()
            java.lang.String r0 = "\t"
            java.lang.String r1 = "    "
            java.lang.String r4 = r4.replace(r0, r1)
        L28:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L5b
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "\n"
            java.lang.String r1 = "\n  "
            java.lang.String r4 = r4.replace(r0, r1)
            int r0 = r3.length()
            int r0 = r0 + 4
            int r0 = p064e.C1489c.m4038a(r4, r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r2.append(r3)
            r2.append(r1)
            r2.append(r4)
            r3 = 10
            r2.append(r3)
            java.lang.String r3 = r2.toString()
        L5b:
            return r3
    }

    @org.checkerframework.dataflow.qual.Pure
    /* renamed from: b */
    public static void m13369b(java.lang.String r0, java.lang.String r1, java.lang.Throwable r2) {
            java.lang.String r1 = m13368a(r1, r2)
            android.util.Log.e(r0, r1)
            return
    }

    @org.checkerframework.dataflow.qual.Pure
    /* renamed from: c */
    public static void m13370c(java.lang.String r0, java.lang.String r1, java.lang.Throwable r2) {
            java.lang.String r1 = m13368a(r1, r2)
            android.util.Log.w(r0, r1)
            return
    }
}
