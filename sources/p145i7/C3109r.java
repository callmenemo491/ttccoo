package p145i7;

/* renamed from: i7.r */
/* loaded from: classes.dex */
public final class C3109r {

    /* renamed from: a */
    public static final p333t1.AbstractC6102f f12497a = null;

    static {
            r0 = 0
            java.lang.String r1 = "android.os.Build$VERSION"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L17
            java.lang.String r2 = "SDK_INT"
            java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L17
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L17
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L17
            r0 = r1
            goto L24
        L15:
            r1 = move-exception
            goto L48
        L17:
            r1 = move-exception
            java.io.PrintStream r2 = java.lang.System.err     // Catch: java.lang.Throwable -> L15
            java.lang.String r3 = "Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception."
            r2.println(r3)     // Catch: java.lang.Throwable -> L15
            java.io.PrintStream r2 = java.lang.System.err     // Catch: java.lang.Throwable -> L15
            r1.printStackTrace(r2)     // Catch: java.lang.Throwable -> L15
        L24:
            if (r0 == 0) goto L34
            int r1 = r0.intValue()     // Catch: java.lang.Throwable -> L15
            r2 = 19
            if (r1 < r2) goto L34
            i7.q r1 = new i7.q     // Catch: java.lang.Throwable -> L15
            r1.<init>()     // Catch: java.lang.Throwable -> L15
            goto L79
        L34:
            java.lang.String r1 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
            boolean r1 = java.lang.Boolean.getBoolean(r1)     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L42
            i7.o r1 = new i7.o     // Catch: java.lang.Throwable -> L15
            r1.<init>()     // Catch: java.lang.Throwable -> L15
            goto L79
        L42:
            i7.p r1 = new i7.p     // Catch: java.lang.Throwable -> L15
            r1.<init>()     // Catch: java.lang.Throwable -> L15
            goto L79
        L48:
            java.io.PrintStream r2 = java.lang.System.err
            java.lang.Class<i7.p> r3 = p145i7.C3107p.class
            java.lang.String r3 = r3.getName()
            int r4 = r3.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r4 = r4 + 133
            r5.<init>(r4)
            java.lang.String r4 = "An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy "
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = "will be used. The error is: "
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r2.println(r3)
            java.io.PrintStream r2 = java.lang.System.err
            r1.printStackTrace(r2)
            i7.p r1 = new i7.p
            r1.<init>()
        L79:
            p145i7.C3109r.f12497a = r1
            if (r0 != 0) goto L7e
            return
        L7e:
            r0.intValue()
            return
    }
}
