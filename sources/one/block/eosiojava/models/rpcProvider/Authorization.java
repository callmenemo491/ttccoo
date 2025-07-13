package one.block.eosiojava.models.rpcProvider;

/* loaded from: classes.dex */
public class Authorization implements java.io.Serializable {

    @p189kb.InterfaceC4079b("actor")
    private java.lang.String actor;

    @p189kb.InterfaceC4079b("permission")
    private java.lang.String permission;

    public Authorization(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.actor = r1
            r0.permission = r2
            return
    }

    public java.lang.String getActor() {
            r1 = this;
            java.lang.String r0 = r1.actor
            return r0
    }

    public java.lang.String getPermission() {
            r1 = this;
            java.lang.String r0 = r1.permission
            return r0
    }

    public void setActor(java.lang.String r1) {
            r0 = this;
            r0.actor = r1
            return
    }

    public void setPermission(java.lang.String r1) {
            r0 = this;
            r0.permission = r1
            return
    }
}
