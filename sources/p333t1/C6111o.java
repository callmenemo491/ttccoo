package p333t1;

/* renamed from: t1.o */
/* loaded from: classes.dex */
public class C6111o {

    /* renamed from: a */
    public final java.util.Map<java.lang.String, java.lang.Object> f23621a;

    /* renamed from: b */
    public android.view.View f23622b;

    /* renamed from: c */
    public final java.util.ArrayList<p333t1.AbstractC6104h> f23623c;

    @java.lang.Deprecated
    public C6111o() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f23621a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f23623c = r0
            return
    }

    public C6111o(android.view.View r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f23621a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f23623c = r0
            r1.f23622b = r2
            return
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof p333t1.C6111o
            if (r0 == 0) goto L18
            android.view.View r0 = r2.f23622b
            t1.o r3 = (p333t1.C6111o) r3
            android.view.View r1 = r3.f23622b
            if (r0 != r1) goto L18
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f23621a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r3.f23621a
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L18
            r3 = 1
            return r3
        L18:
            r3 = 0
            return r3
    }

    public int hashCode() {
            r2 = this;
            android.view.View r0 = r2.f23622b
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.Map<java.lang.String, java.lang.Object> r1 = r2.f23621a
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = "TransitionValues@"
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            int r1 = r5.hashCode()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = ":\n"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "    view = "
            java.lang.StringBuilder r0 = android.support.v4.media.C0143b.m255a(r0, r1)
            android.view.View r1 = r5.f23622b
            r0.append(r1)
            java.lang.String r1 = "\n"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "    values:"
            java.lang.String r0 = p064e.C1493g.m4049a(r0, r2)
            java.util.Map<java.lang.String, java.lang.Object> r2 = r5.f23621a
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        L3e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L70
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = "    "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = ": "
            r4.append(r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r5.f23621a
            java.lang.Object r0 = r0.get(r3)
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = r4.toString()
            goto L3e
        L70:
            return r0
    }
}
