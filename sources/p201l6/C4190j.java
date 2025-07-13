package p201l6;

/* renamed from: l6.j */
/* loaded from: classes.dex */
public final class C4190j extends java.lang.UnsupportedOperationException {

    /* renamed from: Y */
    public final p184k6.C3701d f17358Y;

    public C4190j(@androidx.annotation.RecentlyNonNull p184k6.C3701d r1) {
            r0 = this;
            r0.<init>()
            r0.f17358Y = r1
            return
    }

    @Override // java.lang.Throwable
    @androidx.annotation.RecentlyNonNull
    public final java.lang.String getMessage() {
            r3 = this;
            k6.d r0 = r3.f17358Y
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            int r1 = r1 + 8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Missing "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }
}
