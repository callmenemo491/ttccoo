package p184k6;

/* renamed from: k6.c */
/* loaded from: classes.dex */
public class DialogFragmentC3700c extends android.app.DialogFragment {

    /* renamed from: Y */
    public android.app.Dialog f16398Y;

    /* renamed from: Z */
    public android.content.DialogInterface.OnCancelListener f16399Z;

    /* renamed from: a0 */
    public android.app.Dialog f16400a0;

    public DialogFragmentC3700c() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@androidx.annotation.RecentlyNonNull android.content.DialogInterface r2) {
            r1 = this;
            android.content.DialogInterface$OnCancelListener r0 = r1.f16399Z
            if (r0 == 0) goto L7
            r0.onCancel(r2)
        L7:
            return
    }

    @Override // android.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle r2) {
            r1 = this;
            android.app.Dialog r2 = r1.f16398Y
            if (r2 != 0) goto L1d
            r2 = 0
            r1.setShowsDialog(r2)
            android.app.Dialog r2 = r1.f16400a0
            if (r2 != 0) goto L1b
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            android.app.Activity r0 = r1.getActivity()
            r2.<init>(r0)
            android.app.AlertDialog r2 = r2.create()
            r1.f16400a0 = r2
        L1b:
            android.app.Dialog r2 = r1.f16400a0
        L1d:
            return r2
    }

    @Override // android.app.DialogFragment
    public void show(@androidx.annotation.RecentlyNonNull android.app.FragmentManager r1, java.lang.String r2) {
            r0 = this;
            super.show(r1, r2)
            return
    }
}
