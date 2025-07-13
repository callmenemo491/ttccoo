package p414xc;

/* renamed from: xc.c */
/* loaded from: classes.dex */
public class C7028c {
    private java.util.Map<java.lang.String, java.lang.Object> gData;
    private java.lang.String gPackedData;

    public C7028c(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.gPackedData = r1
            return
    }

    public C7028c(java.util.Map<java.lang.String, java.lang.Object> r1) {
            r0 = this;
            r0.<init>()
            r0.gData = r1
            return
    }

    public C7028c(p169jb.C3476s r1) {
            r0 = this;
            r0.<init>()
            java.util.Map r1 = p435yc.C7155a.m14268a(r1)
            r0.gData = r1
            return
    }

    public java.util.Map<java.lang.String, java.lang.Object> getData() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.gData
            return r0
    }

    public java.lang.String getPackedData() {
            r1 = this;
            java.lang.String r0 = r1.gPackedData
            return r0
    }

    public boolean isPacked() {
            r1 = this;
            java.lang.String r0 = r1.gPackedData
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public void setData(java.lang.String r1) {
            r0 = this;
            r0.gPackedData = r1
            r1 = 0
            r0.gData = r1
            return
    }

    public void setData(java.util.Map<java.lang.String, java.lang.Object> r1) {
            r0 = this;
            r0.gData = r1
            r1 = 0
            r0.gPackedData = r1
            return
    }

    public java.lang.String toJSON() {
            r2 = this;
            boolean r0 = r2.isPacked()
            if (r0 != 0) goto Ld
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.gData
            java.lang.String r0 = p435yc.C7155a.m14270c(r0)
            return r0
        Ld:
            uc.a r0 = new uc.a
            java.lang.String r1 = "Cannot toJSON packed action data"
            r0.<init>(r1)
            throw r0
    }

    public java.lang.String toString() {
            r2 = this;
            boolean r0 = r2.isPacked()     // Catch: p358uc.C6372a -> L10
            if (r0 == 0) goto Lb
            java.lang.String r0 = r2.getPackedData()     // Catch: p358uc.C6372a -> L10
            goto Lf
        Lb:
            java.lang.String r0 = r2.toJSON()     // Catch: p358uc.C6372a -> L10
        Lf:
            return r0
        L10:
            r0 = move-exception
            java.lang.String r1 = "Failed to toJSON - "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
