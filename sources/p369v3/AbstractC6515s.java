package p369v3;

@com.google.auto.value.AutoValue
/* renamed from: v3.s */
/* loaded from: classes.dex */
public abstract class AbstractC6515s {
    public AbstractC6515s() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static p369v3.AbstractC6515s m13240a(java.io.Reader r3) {
            android.util.JsonReader r0 = new android.util.JsonReader
            r0.<init>(r3)
            r0.beginObject()     // Catch: java.lang.Throwable -> L4c
        L8:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L4c
            if (r3 == 0) goto L44
            java.lang.String r3 = r0.nextName()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r1 = "nextRequestWaitMillis"
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L4c
            if (r3 == 0) goto L40
            android.util.JsonToken r3 = r0.peek()     // Catch: java.lang.Throwable -> L4c
            android.util.JsonToken r1 = android.util.JsonToken.STRING     // Catch: java.lang.Throwable -> L4c
            if (r3 != r1) goto L33
            java.lang.String r3 = r0.nextString()     // Catch: java.lang.Throwable -> L4c
            long r1 = java.lang.Long.parseLong(r3)     // Catch: java.lang.Throwable -> L4c
            v3.m r3 = new v3.m     // Catch: java.lang.Throwable -> L4c
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L4c
            r0.close()
            return r3
        L33:
            long r1 = r0.nextLong()     // Catch: java.lang.Throwable -> L4c
            v3.m r3 = new v3.m     // Catch: java.lang.Throwable -> L4c
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L4c
            r0.close()
            return r3
        L40:
            r0.skipValue()     // Catch: java.lang.Throwable -> L4c
            goto L8
        L44:
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.Throwable -> L4c
            java.lang.String r1 = "Response is missing nextRequestWaitMillis field."
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L4c
            throw r3     // Catch: java.lang.Throwable -> L4c
        L4c:
            r3 = move-exception
            r0.close()
            throw r3
    }

    /* renamed from: b */
    public abstract long mo13237b();
}
