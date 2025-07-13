package ki;

/* renamed from: ki.d */
/* loaded from: classes.dex */
public final class C4131d extends java.util.logging.Handler {

    /* renamed from: a */
    public static final ki.C4131d f17147a = null;

    static {
            ki.d r0 = new ki.d
            r0.<init>()
            ki.C4131d.f17147a = r0
            return
    }

    public C4131d() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.logging.Handler
    public void close() {
            r0 = this;
            return
    }

    @Override // java.util.logging.Handler
    public void flush() {
            r0 = this;
            return
    }

    @Override // java.util.logging.Handler
    public void publish(java.util.logging.LogRecord r10) {
            r9 = this;
            java.lang.String r0 = "record"
            p214m2.C4339q.m9706k(r10, r0)
            ki.c r0 = ki.C4130c.f17146c
            java.lang.String r0 = r10.getLoggerName()
            java.lang.String r1 = "record.loggerName"
            p214m2.C4339q.m9705j(r0, r1)
            java.util.logging.Level r1 = r10.getLevel()
            int r1 = r1.intValue()
            java.util.logging.Level r2 = java.util.logging.Level.INFO
            int r2 = r2.intValue()
            r3 = 4
            if (r1 <= r2) goto L23
            r1 = 5
            goto L36
        L23:
            java.util.logging.Level r1 = r10.getLevel()
            int r1 = r1.intValue()
            java.util.logging.Level r2 = java.util.logging.Level.INFO
            int r2 = r2.intValue()
            if (r1 != r2) goto L35
            r1 = 4
            goto L36
        L35:
            r1 = 3
        L36:
            java.lang.String r2 = r10.getMessage()
            java.lang.String r4 = "record.message"
            p214m2.C4339q.m9705j(r2, r4)
            java.lang.Throwable r10 = r10.getThrown()
            java.lang.String r4 = "loggerName"
            p214m2.C4339q.m9706k(r0, r4)
            java.lang.String r4 = "message"
            p214m2.C4339q.m9706k(r2, r4)
            java.util.Map<java.lang.String, java.lang.String> r4 = ki.C4130c.f17145b
            java.lang.Object r4 = r4.get(r0)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L58
            goto L5e
        L58:
            r4 = 23
            java.lang.String r4 = p362uh.C6469o.m13084o0(r0, r4)
        L5e:
            boolean r0 = android.util.Log.isLoggable(r4, r1)
            if (r0 == 0) goto La3
            if (r10 == 0) goto L77
            java.lang.String r0 = "\n"
            java.lang.StringBuilder r0 = android.support.v4.media.C0143b.m255a(r2, r0)
            java.lang.String r10 = android.util.Log.getStackTraceString(r10)
            r0.append(r10)
            java.lang.String r2 = r0.toString()
        L77:
            int r10 = r2.length()
            r0 = 0
            r5 = 0
        L7d:
            if (r5 >= r10) goto La3
            r6 = 10
            int r6 = p362uh.C6467m.m13069Z(r2, r6, r5, r0, r3)
            r7 = -1
            if (r6 == r7) goto L89
            goto L8a
        L89:
            r6 = r10
        L8a:
            int r7 = r5 + 4000
            int r7 = java.lang.Math.min(r6, r7)
            java.lang.String r5 = r2.substring(r5, r7)
            java.lang.String r8 = "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"
            p214m2.C4339q.m9705j(r5, r8)
            android.util.Log.println(r1, r4, r5)
            if (r7 < r6) goto La1
            int r5 = r7 + 1
            goto L7d
        La1:
            r5 = r7
            goto L8a
        La3:
            return
    }
}
