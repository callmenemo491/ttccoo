package p414xc;

/* renamed from: xc.h */
/* loaded from: classes.dex */
public class C7033h {
    private static final java.lang.String DATA = "data";
    private static final java.lang.String TYPE = "type";
    private java.lang.String gData;
    private java.lang.Short gType;

    public C7033h(java.lang.Short r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.gType = r1
            r0.gData = r2
            return
    }

    public C7033h(p169jb.C3476s r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "type"
            jb.p r0 = r2.m7949n(r0)
            short r0 = r0.mo7943i()
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
            r1.gType = r0
            java.lang.String r0 = "data"
            jb.p r2 = r2.m7949n(r0)
            java.lang.String r2 = r2.mo7944l()
            r1.gData = r2
            return
    }

    public java.lang.String getData() {
            r1 = this;
            java.lang.String r0 = r1.gData
            return r0
    }

    public java.lang.Short getType() {
            r1 = this;
            java.lang.Short r0 = r1.gType
            return r0
    }

    public void setData(java.lang.String r1) {
            r0 = this;
            r0.gData = r1
            return
    }

    public void setType(java.lang.Short r1) {
            r0 = this;
            r0.gType = r1
            return
    }

    public java.util.Map<java.lang.Short, java.lang.String> toMap() {
            r3 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.Short r1 = r3.gType
            java.lang.String r2 = r3.gData
            r0.put(r1, r2)
            return r0
    }
}
