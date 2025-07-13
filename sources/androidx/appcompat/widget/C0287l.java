package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.l */
/* loaded from: classes.dex */
public class C0287l extends android.widget.EditText implements p227n0.InterfaceC4655n {

    /* renamed from: a0 */
    public final androidx.appcompat.widget.C0273f f1366a0;

    /* renamed from: b0 */
    public final androidx.appcompat.widget.C0313y f1367b0;

    /* renamed from: c0 */
    public final androidx.appcompat.widget.C0311x f1368c0;

    /* renamed from: d0 */
    public final p280q0.C5541h f1369d0;

    public C0287l(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 2130968949(0x7f040175, float:1.7546566E38)
            r1.<init>(r2, r3, r0)
            return
    }

    public C0287l(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            androidx.appcompat.widget.C0308v0.m793a(r1)
            r0.<init>(r1, r2, r3)
            android.content.Context r1 = r0.getContext()
            androidx.appcompat.widget.C0304t0.m787a(r0, r1)
            androidx.appcompat.widget.f r1 = new androidx.appcompat.widget.f
            r1.<init>(r0)
            r0.f1366a0 = r1
            r1.m714d(r2, r3)
            androidx.appcompat.widget.y r1 = new androidx.appcompat.widget.y
            r1.<init>(r0)
            r0.f1367b0 = r1
            r1.m836e(r2, r3)
            r1.m834b()
            androidx.appcompat.widget.x r1 = new androidx.appcompat.widget.x
            r1.<init>(r0)
            r0.f1368c0 = r1
            q0.h r1 = new q0.h
            r1.<init>()
            r0.f1369d0 = r1
            return
    }

    @Override // p227n0.InterfaceC4655n
    /* renamed from: a */
    public p227n0.C4644c mo753a(p227n0.C4644c r2) {
            r1 = this;
            q0.h r0 = r1.f1369d0
            n0.c r2 = r0.mo10518a(r1, r2)
            return r2
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            androidx.appcompat.widget.f r0 = r1.f1366a0
            if (r0 == 0) goto La
            r0.m711a()
        La:
            androidx.appcompat.widget.y r0 = r1.f1367b0
            if (r0 == 0) goto L11
            r0.m834b()
        L11:
            return
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            androidx.appcompat.widget.f r0 = r1.f1366a0
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.m712b()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            androidx.appcompat.widget.f r0 = r1.f1366a0
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.m713c()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // android.widget.EditText, android.widget.TextView
    public android.text.Editable getText() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            android.text.Editable r0 = super.getText()
            return r0
        Lb:
            android.text.Editable r0 = super.getEditableText()
            return r0
    }

    @Override // android.widget.EditText, android.widget.TextView
    public /* bridge */ /* synthetic */ java.lang.CharSequence getText() {
            r1 = this;
            android.text.Editable r0 = r1.getText()
            return r0
    }

    @Override // android.widget.TextView
    public android.view.textclassifier.TextClassifier getTextClassifier() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L10
            androidx.appcompat.widget.x r0 = r2.f1368c0
            if (r0 != 0) goto Lb
            goto L10
        Lb:
            android.view.textclassifier.TextClassifier r0 = r0.m823n()
            return r0
        L10:
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r8) {
            r7 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r8)
            androidx.appcompat.widget.y r1 = r7.f1367b0
            r1.m838g(r7, r0, r8)
            p064e.C1487a.m4030h(r0, r8, r7)
            java.lang.String[] r1 = p227n0.C4661t.m10536l(r7)
            if (r0 == 0) goto L6e
            if (r1 == 0) goto L6e
            int r2 = android.os.Build.VERSION.SDK_INT
            java.lang.String r3 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String r4 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r5 = 25
            if (r2 < r5) goto L21
            r8.contentMimeTypes = r1
            goto L36
        L21:
            android.os.Bundle r6 = r8.extras
            if (r6 != 0) goto L2c
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r8.extras = r6
        L2c:
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r4, r1)
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r3, r1)
        L36:
            androidx.appcompat.widget.t r1 = new androidx.appcompat.widget.t
            r1.<init>(r7)
            r6 = 0
            if (r2 < r5) goto L45
            p0.b r8 = new p0.b
            r8.<init>(r0, r6, r1)
        L43:
            r0 = r8
            goto L6e
        L45:
            if (r2 < r5) goto L4c
            java.lang.String[] r8 = r8.contentMimeTypes
            if (r8 == 0) goto L62
            goto L64
        L4c:
            android.os.Bundle r2 = r8.extras
            if (r2 != 0) goto L51
            goto L62
        L51:
            java.lang.String[] r2 = r2.getStringArray(r4)
            if (r2 != 0) goto L5e
            android.os.Bundle r8 = r8.extras
            java.lang.String[] r8 = r8.getStringArray(r3)
            goto L5f
        L5e:
            r8 = r2
        L5f:
            if (r8 == 0) goto L62
            goto L64
        L62:
            java.lang.String[] r8 = p264p0.C5337a.f21231a
        L64:
            int r8 = r8.length
            if (r8 != 0) goto L68
            goto L6e
        L68:
            p0.c r8 = new p0.c
            r8.<init>(r0, r6, r1)
            goto L43
        L6e:
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(android.view.DragEvent r6) {
            r5 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            r2 = 1
            r3 = 0
            if (r0 < r1) goto L95
            java.lang.Object r0 = r6.getLocalState()
            if (r0 != 0) goto L95
            java.lang.String[] r0 = p227n0.C4661t.m10536l(r5)
            if (r0 != 0) goto L16
            goto L95
        L16:
            android.content.Context r0 = r5.getContext()
        L1a:
            boolean r1 = r0 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L2c
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L25
            android.app.Activity r0 = (android.app.Activity) r0
            goto L2d
        L25:
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L1a
        L2c:
            r0 = 0
        L2d:
            if (r0 != 0) goto L46
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Can't handle drop: no activity: view="
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ReceiveContent"
            android.util.Log.i(r1, r0)
            goto L95
        L46:
            int r1 = r6.getAction()
            if (r1 != r2) goto L4d
            goto L95
        L4d:
            int r1 = r6.getAction()
            r4 = 3
            if (r1 != r4) goto L95
            r1 = 31
            r0.requestDragAndDropPermissions(r6)
            float r0 = r6.getX()
            float r3 = r6.getY()
            int r0 = r5.getOffsetForPosition(r0, r3)
            r5.beginBatchEdit()
            java.lang.CharSequence r3 = r5.getText()     // Catch: java.lang.Throwable -> L90
            android.text.Spannable r3 = (android.text.Spannable) r3     // Catch: java.lang.Throwable -> L90
            android.text.Selection.setSelection(r3, r0)     // Catch: java.lang.Throwable -> L90
            android.content.ClipData r0 = r6.getClipData()     // Catch: java.lang.Throwable -> L90
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L90
            if (r3 < r1) goto L7f
            n0.c$a r1 = new n0.c$a     // Catch: java.lang.Throwable -> L90
            r1.<init>(r0, r4)     // Catch: java.lang.Throwable -> L90
            goto L84
        L7f:
            n0.c$c r1 = new n0.c$c     // Catch: java.lang.Throwable -> L90
            r1.<init>(r0, r4)     // Catch: java.lang.Throwable -> L90
        L84:
            n0.c r0 = r1.mo10494b()     // Catch: java.lang.Throwable -> L90
            p227n0.C4661t.m10541q(r5, r0)     // Catch: java.lang.Throwable -> L90
            r5.endBatchEdit()
            r3 = 1
            goto L95
        L90:
            r6 = move-exception
            r5.endBatchEdit()
            throw r6
        L95:
            if (r3 == 0) goto L98
            return r2
        L98:
            boolean r6 = super.onDragEvent(r6)
            return r6
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int r7) {
            r6 = this;
            r0 = 0
            r1 = 16908322(0x1020022, float:2.3877324E-38)
            r2 = 1
            if (r7 == r1) goto Lc
            r3 = 16908337(0x1020031, float:2.3877366E-38)
            if (r7 != r3) goto L4f
        Lc:
            java.lang.String[] r3 = p227n0.C4661t.m10536l(r6)
            if (r3 != 0) goto L13
            goto L4f
        L13:
            android.content.Context r3 = r6.getContext()
            java.lang.String r4 = "clipboard"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.content.ClipboardManager r3 = (android.content.ClipboardManager) r3
            if (r3 != 0) goto L23
            r3 = 0
            goto L27
        L23:
            android.content.ClipData r3 = r3.getPrimaryClip()
        L27:
            if (r3 == 0) goto L4e
            int r4 = r3.getItemCount()
            if (r4 <= 0) goto L4e
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            if (r4 < r5) goto L3b
            n0.c$a r4 = new n0.c$a
            r4.<init>(r3, r2)
            goto L40
        L3b:
            n0.c$c r4 = new n0.c$c
            r4.<init>(r3, r2)
        L40:
            if (r7 != r1) goto L43
            goto L44
        L43:
            r0 = 1
        L44:
            r4.mo10493a(r0)
            n0.c r0 = r4.mo10494b()
            p227n0.C4661t.m10541q(r6, r0)
        L4e:
            r0 = 1
        L4f:
            if (r0 == 0) goto L52
            return r2
        L52:
            boolean r7 = super.onTextContextMenuItem(r7)
            return r7
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            androidx.appcompat.widget.f r1 = r0.f1366a0
            if (r1 == 0) goto La
            r1.m715e()
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            super.setBackgroundResource(r2)
            androidx.appcompat.widget.f r0 = r1.f1366a0
            if (r0 == 0) goto La
            r0.m716f(r2)
        La:
            return
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback r1) {
            r0 = this;
            android.view.ActionMode$Callback r1 = p280q0.C5540g.m11823g(r0, r1)
            super.setCustomSelectionActionModeCallback(r1)
            return
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.f r0 = r1.f1366a0
            if (r0 == 0) goto L7
            r0.m718h(r2)
        L7:
            return
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.f r0 = r1.f1366a0
            if (r0 == 0) goto L7
            r0.m719i(r2)
        L7:
            return
    }

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context r2, int r3) {
            r1 = this;
            super.setTextAppearance(r2, r3)
            androidx.appcompat.widget.y r0 = r1.f1367b0
            if (r0 == 0) goto La
            r0.m837f(r2, r3)
        La:
            return
    }

    @Override // android.widget.TextView
    public void setTextClassifier(android.view.textclassifier.TextClassifier r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto Le
            androidx.appcompat.widget.x r0 = r2.f1368c0
            if (r0 != 0) goto Lb
            goto Le
        Lb:
            r0.f1482a0 = r3
            return
        Le:
            super.setTextClassifier(r3)
            return
    }
}
