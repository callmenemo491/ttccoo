package one.block.eosiojava.error;

/* loaded from: classes.dex */
public class EosioError extends java.lang.Exception {
    public EosioError() {
            r0 = this;
            r0.<init>()
            return
    }

    public EosioError(java.lang.Exception r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public EosioError(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public EosioError(java.lang.String r1, java.lang.Exception r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public java.lang.String asJsonString() {
            r4 = this;
            jb.s r0 = new jb.s
            r0.<init>()
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r2 = "errorCode"
            r0.m7948m(r2, r1)
            java.lang.String r1 = r4.getLocalizedMessage()
            java.lang.String r2 = "reason"
            r0.m7948m(r2, r1)
            jb.s r1 = new jb.s
            r1.<init>()
            java.lang.String r2 = "errorType"
            java.lang.String r3 = "EosioError"
            r1.m7948m(r2, r3)
            lb.r<java.lang.String, jb.p> r2 = r1.f14968a
            java.lang.String r3 = "errorInfo"
            r2.put(r3, r0)
            jb.k r0 = new jb.k
            r0.<init>()
            r2 = 1
            r0.f14965l = r2
            jb.j r0 = r0.m7939a()
            java.lang.String r0 = r0.m7936j(r1)
            return r0
    }
}
